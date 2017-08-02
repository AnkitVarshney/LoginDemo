
package com.test.data.executor.network;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.test.data.executor.model.LoginResponseModel;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;


/**
 * Created by Devesh on 6/4/17.
 */
@Singleton
public class NetworkManager {

    private TrebleApi mTrebleApiService;

    @Inject
    public NetworkManager(Retrofit retrofit, OkHttpClient okHttpClient, Gson gson, Cache cache) {
        mTrebleApiService = retrofit.create(TrebleApi.class);
    }


    public void requestLogin(NetworkRequest getProfileRequest, Callback<LoginResponseModel> callback) {
        Call call = mTrebleApiService.loginUser(getProfileRequest.getParameterJson());
        call.enqueue(callback);
    }

}
