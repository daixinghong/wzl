package com.wole.wozhilian.home.presenter;

import com.wole.wozhilian.base.BaseInterface;
import com.wole.wozhilian.home.model.bean.UserDeviceBean;

/**
 * Created by Administrator on 2018/11/23.
 */

public interface DeviceInterface extends BaseInterface {

    void getDeviceListSuccess(UserDeviceBean userDeviceBean);


}
