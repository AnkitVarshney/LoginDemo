package com.test.data.executor.network;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Created by Devesh on 3/4/17.
 */

public class JSONBuilder{

    protected JsonObject mJsonBody;

    public JSONBuilder(JsonObject json) {
        mJsonBody = json;
    }

    public JSONBuilder() {
        mJsonBody = new JsonObject();
    }

    public void add(String key, String value) {
        mJsonBody.addProperty(key, value);
    }

    public void addArray(String key, JsonArray value) {
        mJsonBody.add(key, value);
    }

    public void add(String key, int value) {
        mJsonBody.addProperty(key, value);
    }

    public JsonObject build() {
        return mJsonBody;
    }
}