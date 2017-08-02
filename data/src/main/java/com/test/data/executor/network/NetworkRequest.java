package com.test.data.executor.network;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.HashMap;

/**
 * Created by Devesh on 3/4/17.
 */

public class NetworkRequest {

    private JSONBuilder mBuilder;

    public String url;
    public HashMap<String, String> parameterMap;
    public String parameterStr;
    public JsonObject parameterJson;

    public NetworkRequest() {
        mBuilder = new JSONBuilder();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HashMap<String, String> getParameterMap() {
        return parameterMap;
    }

    public void setParameterMap(HashMap<String, String> parameterMap) {

        parameterMap.put("strFormat", "json");

        this.parameterMap = parameterMap;
    }

    public JsonObject getParameterJson() {
        return mBuilder.build();
    }

    public void addParameter(String key, String value) {
        mBuilder.add(key, value);
    }

    public void addArray(String key, JsonArray value){
        mBuilder.addArray(key, value);
    }

    public void addParameter(String key, int value) {
        mBuilder.add(key, value);
    }

    public void setParameterJson(JsonObject parameterJson) {
        this.parameterJson = parameterJson;
    }

    public String getParameterStr() {
        return parameterStr;
    }

    public void setParameterStr(String parameterStr) {
        this.parameterStr = parameterStr;
    }
}