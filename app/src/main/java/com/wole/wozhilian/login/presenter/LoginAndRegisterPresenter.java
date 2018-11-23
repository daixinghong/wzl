package com.wole.wozhilian.login.presenter;

import com.wole.wozhilian.http.RetrofitNetwork;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/11/23.
 */

public class LoginAndRegisterPresenter  {

    private LoginAndRegisterInterface mInterface;

    public LoginAndRegisterPresenter(LoginAndRegisterInterface loginAndRegisterInterface){

        this.mInterface = loginAndRegisterInterface;
    }


    public void login() {
        RetrofitNetwork
                .getObserableIntence()
                .login(mInterface.getMethod(),mInterface.getUserName(),mInterface.getPassword())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mInterface::loginSuccess, mInterface::getDataError);
    }




}
