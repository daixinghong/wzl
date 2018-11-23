package com.wole.wozhilian.http;

import com.wole.wozhilian.home.model.bean.UserDeviceBean;
import com.wole.wozhilian.login.model.LoginBean;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2018/11/23.
 */

public interface HttpInterface {


    /**
     * 登录
     *
     * @param m
     * @param user
     * @param password
     * @return
     */
    @GET("Auth.ashx")
    Observable<LoginBean> login(@Query("m") String m, @Query("u") String user, @Query("p") String password);


    /**
     * 查询用户设备
     *
     * @param map
     * @return
     */
    @GET("Equipment.ashx")
    Observable<UserDeviceBean> queryUserDevice(@Query("access_token") String token,@QueryMap Map<String, Object> map);


    /**
     * 查询当前设备数据
     *
     * @param map
     * @return
     */
    @GET("Data.ashx")
    Observable<UserDeviceBean> queryDeviceCurrentData(@QueryMap Map<String, Object> map);


    /**
     * 查询客户当前信息
     *
     * @param map
     * @return
     */
    @GET("User.ashx")
    Observable<UserDeviceBean> queryUserInfo(@QueryMap Map<String, Object> map);


    /**
     * 绑定设备到指定用户
     *
     * @param map
     * @return
     */
    @GET("Equipment.ashx")
    Observable<UserDeviceBean> bindDeviceUser(@QueryMap Map<String, Object> map);


}
