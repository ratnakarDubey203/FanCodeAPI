package com.fancode.utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class APICalls {
    public String callAPI(String resource) {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com/";
        return RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(resource)
                .then().statusCode(200).extract().response().asPrettyString();
    }
}
