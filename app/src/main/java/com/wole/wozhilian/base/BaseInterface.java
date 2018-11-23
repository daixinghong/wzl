package com.wole.wozhilian.base;

import java.util.Map;

/**
 * Created by Administrator on 2018/11/23.
 */

public interface BaseInterface {


    void getDataError(Throwable throwable);

    String getToken();

    Map<String,Object> getMap();
}
