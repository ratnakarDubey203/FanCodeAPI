import com.fancode.utilities.JsonParser;
import io.restassured.*;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class User {
    JsonParser jsonParser = new JsonParser();
    String response;

    @Test
    public void getUserDetails() {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";

        response = RestAssured.given().contentType(ContentType.JSON)
                .get("/users")
                .then().log().all()
                .statusCode(200).extract().response().asPrettyString();

        System.out.print("response :" + response);

        List<Integer> idList = jsonParser.getIntegerListFromJson(response, "id");
        List<String> usernameList = jsonParser.getStringListFromJson(response, "name");
        List<String> latList = jsonParser.getStringListFromJson(response, "address.geo.lat");
        List<String> lngList = jsonParser.getStringListFromJson(response, "address.geo.lng");
        HashMap<Integer, String> userDetails = new HashMap<>();


        for (int i = 0; i < latList.size(); i++) {
            double latitude = Double.parseDouble(latList.get(i));
            double longitude = Double.parseDouble(lngList.get(i));

            if (latitude > -40 && latitude < 5 && longitude > 5 && longitude < 100) {
                userDetails.put(idList.get(i), usernameList.get(i));
            }
        }

        response = RestAssured.given().contentType(ContentType.JSON)
                .get("/todos")
                .then().log().all()
                .statusCode(200).extract().response().asPrettyString();

        List<Integer> userIdList = jsonParser.getIntegerListFromJson(response, "userId");
        List<Boolean> taskStatusList = jsonParser.getBooleanListFromJson(response, "completed");

        for (Map.Entry<Integer, String> e : userDetails.entrySet()) {
            int taskCount = 0;
            int compeletedTaskCount = 0;
            int id = e.getKey();

            taskCount = (int) userIdList.stream().filter(u -> u.equals(id)).count();

            compeletedTaskCount = (int) IntStream.range(0, userIdList.size())
                    .filter(j -> userIdList.get(j).equals(id))
                    .filter(j -> taskStatusList.get(j).equals(true)).count();

            int taskPercentage = compeletedTaskCount * 100 / taskCount;

            if (taskPercentage > 50)
                System.out.println(e.getValue() + " has completed " + taskPercentage + "% task.");
        }
    }
}
