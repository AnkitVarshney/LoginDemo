package com.test.data.executor.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Devesh on 6/4/17.
 */

public class LoginResponseModel {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("is_synk_contact")
    @Expose
    private Integer isSynkContact;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getIsSynkContact() {
        return isSynkContact;
    }

    public void setIsSynkContact(Integer isSynkContact) {
        this.isSynkContact = isSynkContact;
    }

}
