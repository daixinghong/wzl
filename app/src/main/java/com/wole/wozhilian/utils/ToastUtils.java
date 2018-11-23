package com.wole.wozhilian.utils;

import android.text.TextUtils;
import android.widget.Toast;

import com.wole.wozhilian.application.BaseApplication;

/**
 * Created by Administrator on 2018/11/23.
 */

public class ToastUtils {

    private static Toast toast;

    public static void showTextToast(String msg) {
        if (TextUtils.isEmpty(msg))
            return;
        if (toast == null) {
            toast = Toast.makeText(BaseApplication.getContext(), msg, Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }


    public static void showTextToastLong(String msg) {
        if (TextUtils.isEmpty(msg))
            return;
        if (toast == null) {
            toast = Toast.makeText(BaseApplication.getContext(), msg, Toast.LENGTH_LONG);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }
}
