package com.test.data.executor.network;


import com.google.gson.JsonObject;
import com.test.data.executor.model.LoginResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Devesh on 3/4/17.
 */

public interface TrebleApi {
//    @FormUrlEncoded
//    @POST("users/login")
//    Call<LoginResponseModel> loginUser(@FieldMap HashMap<String, String> params);

    @POST("users/login")
    Call<LoginResponseModel> loginUser(@Body JsonObject json);

}
