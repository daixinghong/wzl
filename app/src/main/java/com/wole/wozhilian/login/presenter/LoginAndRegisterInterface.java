package com.wole.wozhilian.login.presenter;

import com.wole.wozhilian.base.BaseInterface;
import com.wole.wozhilian.login.model.LoginBean;

import java.util.Map;

/**
 * Created by Administrator on 2018/11/23.
 */

public interface LoginAndRegisterInterface  extends BaseInterface {


    void loginSuccess(LoginBean loginBean);


    String getUserName();

    String getPassword();

    String getMethod();



}
