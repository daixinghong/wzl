package com.wole.wozhilian.home.view.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.wole.wozhilian.R;

/**
 * Created by Administrator on 2018/9/13.
 */

public class DevicesFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup mRadioGroup;
    private RadioButton mRbDevices;
    private RadioButton mRbAddDevices;
    private DevicesListFragment mDevicesListFragment;
    private AddDevicesFragment mAddDevicesFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_devices_view, null);

        initView(inflate);

        initData();

        initEvent();

        return inflate;
    }

    private void initEvent() {
        mRadioGroup.setOnCheckedChangeListener(this);
        mRbDevices.setChecked(true);
    }

    private void initData() {

    }

    private void initView(View inflate) {
        mRadioGroup = inflate.findViewById(R.id.rg_group);
        mRbDevices = inflate.findViewById(R.id.rb_devices);
        mRbAddDevices = inflate.findViewById(R.id.rb_add_devices);

    }

    public void hideAllFragment(FragmentTransaction transaction) {
        if (mDevicesListFragment != null) {
            transaction.hide(mDevicesListFragment);
        }
        if (mAddDevicesFragment != null) {
            transaction.hide(mAddDevicesFragment);
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int i) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch (i) {
            case R.id.rb_devices:
                if (mDevicesListFragment == null) {
                    mDevicesListFragment = new DevicesListFragment();
                    transaction.add(R.id.device_framelayout, mDevicesListFragment);
                } else {
                    transaction.show(mDevicesListFragment);
                }
                break;
            case R.id.rb_add_devices:
                if (mAddDevicesFragment == null) {
                    mAddDevicesFragment = new AddDevicesFragment();
                    transaction.add(R.id.device_framelayout, mAddDevicesFragment);
                } else {
                    transaction.show(mAddDevicesFragment);
                }
                break;
        }

        transaction.commit();
    }
}
