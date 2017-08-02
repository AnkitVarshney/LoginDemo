package com.test.data.executor.network;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Devesh on 6/4/17.
 */

public abstract class CallbackHelper<T> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.code() == 200 || response.code() == 201) {
            onSuccess(response.body());
        } else {
            String errorMessage = getErrorMessage(response);
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {


    }

    public abstract void onSuccess(T t);

//    public abstract void onError(TrebleError trebleError);

    private String getErrorMessage(Response<T> response) {
        try {
            String errorBody = response.errorBody().string();
            JSONObject jsonObject = new JSONObject(errorBody);
            return jsonObject.optString("message");
        } catch (JSONException | IOException e) {
            e.printStackTrace();
            return response.message();
        }
    }
}
