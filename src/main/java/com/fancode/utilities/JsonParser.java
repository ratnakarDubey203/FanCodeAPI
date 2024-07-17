package com.fancode.utilities;

import io.restassured.path.json.JsonPath;

import java.util.List;

public class JsonParser {
    public String getStringFromJson(String response, String key) {
        return new JsonPath(response).get(key);
    }

    public List<String> getStringListFromJson(String response, String key) {
        return new JsonPath(response).get(key);
    }

    public List<Integer> getIntegerListFromJson(String response, String key) {
        return new JsonPath(response).get(key);
    }

    public List<Boolean> getBooleanListFromJson(String response, String key) {
        return new JsonPath(response).get(key);
    }
}
