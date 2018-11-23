package com.wole.wozhilian.login.model;

/**
 * Created by Administrator on 2018/11/23.
 */

public class UserInfoBean {


    /**
     * code : 200
     * found : true
     * customer : {"CustomerId":"6917acfb-4a78-4ebe-9fdc-4a2112587899","CustomerNumber":10003,"CustomerCode":"007PV","CustomerName":"深圳市金思成科技有限公司","CustomerShortName":"深圳金思成","CustomerPinyin":"SZSJSCKJYXGS","CustomerEnname":"SZJSC","CustomerLevel":1,"CustomerDes":"","CustomerStatus":1,"VerificateMethod":0,"VerificateKey":"","VerificatePwd":"123","PublicKey":"","PrivateKey":"","DbHost":null,"DbName":null,"DbUser":null,"DbPwd":"","CreatedAt":"\/Date(1537091242000)\/","UpdatedAt":"\/Date(1539741694000)\/"}
     * error :
     */

    private int code;
    private boolean found;
    private String customer;
    private String error;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
