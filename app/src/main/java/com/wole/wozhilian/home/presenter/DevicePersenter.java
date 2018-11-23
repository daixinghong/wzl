package com.wole.wozhilian.home.presenter;

import com.wole.wozhilian.http.RetrofitNetwork;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/11/23.
 */

public class DevicePersenter {


    private DeviceInterface mInterface;

    public DevicePersenter(DeviceInterface deviceInterface){

        this.mInterface = deviceInterface;
    }


    public void getUserDevices() {
        RetrofitNetwork
                .getObserableIntence()
                .queryUserDevice(mInterface.getToken(),mInterface.getMap())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mInterface::getDeviceListSuccess, mInterface::getDataError);
    }


}
