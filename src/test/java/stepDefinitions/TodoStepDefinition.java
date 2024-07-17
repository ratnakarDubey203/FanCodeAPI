package stepDefinitions;

import com.fancode.APIResources.APIResources;
import com.fancode.businessLogic.TodoResourceLogic;
import com.fancode.utilities.APICalls;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.HashMap;

public class TodoStepDefinition {
    APICalls apiCalls = new APICalls();
    public String response;
    public HashMap<Integer,String> userDetails;
    TodoResourceLogic todoResourceLogic = new TodoResourceLogic();

    @Given("User has the todo tasks")
    public void userHasTheTodoTasks() {
        APIResources resources = APIResources.valueOf("getUsers");
        response = apiCalls.callAPI(resources.getResource());
    }

    @And("User belongs to the city FanCode")
    public void userBelongsToTheCityFanCode() {
        userDetails = todoResourceLogic.getFanCodeUserList(response);
    }

    @Then("User Completed task percentage should be greater than {int}%")
    public void userCompletedTaskPercentageShouldBeGreaterThan(int arg0) {
        APIResources resources = APIResources.valueOf("getTodos");
        response = apiCalls.callAPI(resources.getResource());
        todoResourceLogic.getUserList(userDetails, response, arg0);
    }
}
