package com.wole.wozhilian.login.model;

/**
 * Created by Administrator on 2018/11/23.
 */

public class LoginBean {


    /**
     * code : 200
     * u : 007PX
     * access_token : muk7psnMNojR02H7R+qBWbibUwEI2o4G46okuPMTVw///tQK220vCy7iDifCd2VD8cph7yHH+bV35VUlshG9N8PCbiQsGJOayph868JH/BdhpZQ76l8+OWv6wYofIumPHxuFpCT6xM3Jt7pSEDC6TzDoR6gXHzqXreCx8BcimBo=
     * refresh_token :
     * error :
     */

    private int code;
    private String u;
    private String access_token;
    private String refresh_token;
    private String error;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
