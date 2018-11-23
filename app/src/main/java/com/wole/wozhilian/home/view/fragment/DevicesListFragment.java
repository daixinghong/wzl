package com.wole.wozhilian.home.view.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wole.wozhilian.R;
import com.wole.wozhilian.home.adapter.RcyDevicesListAdapter;
import com.wole.wozhilian.home.model.bean.UserDeviceBean;
import com.wole.wozhilian.home.presenter.DeviceInterface;
import com.wole.wozhilian.home.presenter.DevicePersenter;
import com.wole.wozhilian.utils.Constant;
import com.wole.wozhilian.utils.SpUtils;
import com.wole.wozhilian.utils.ToastUtils;
import com.wole.wozhilian.utils.UiUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/14.
 */

public class DevicesListFragment extends Fragment implements DeviceInterface {

    private RecyclerView mRcyDevicesList;
    private RcyDevicesListAdapter mAdapter;
    private List<UserDeviceBean.DataBean> mList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_devices_list_view, null);

        initView(inflate);

        initData();

        initEvent();

        return inflate;
    }

    private void initEvent() {
        mAdapter.setOnItemClickListener(new RcyDevicesListAdapter.OnItemClickListener() {
            @Override
            public void setOnItemClickListener(View view, int position) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                if (view.getTag() == null) {
                    DevicesStatusFragment mDevicesStatusFragment = new DevicesStatusFragment();
                    view.setTag(mDevicesStatusFragment);
                    transaction.add(R.id.device_framelayout, mDevicesStatusFragment);
                } else {
                    transaction.show((DevicesStatusFragment) view.getTag());
                }
                transaction.commit();
            }
        });
    }

    private void initData() {
        mAdapter = new RcyDevicesListAdapter(getActivity(), mList);
        mRcyDevicesList.setAdapter(mAdapter);

        DevicePersenter persenter = new DevicePersenter(this);
        persenter.getUserDevices();


    }

    private void initView(View inflate) {
        mRcyDevicesList = inflate.findViewById(R.id.rcy_device_list);
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 2) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        mRcyDevicesList.setLayoutManager(manager);
        mRcyDevicesList.setNestedScrollingEnabled(false);

    }


    @Override
    public void getDataError(Throwable throwable) {
        ToastUtils.showTextToast(UiUtils.getString(R.string.network_error));
    }

    @Override
    public String getToken() {
        return (String) SpUtils.getParam(getActivity(), Constant.TOKEN,"");
    }

    @Override
    public Map<String, Object> getMap() {

        Map<String, Object> map = new HashMap<>();
        map.put("m", "Query");
        map.put("u",(String)SpUtils.getParam(getActivity(),Constant.USER,""));
        map.put("p", (String)SpUtils.getParam(getActivity(),Constant.PASSWORD,""));

        return map;
    }

    @Override
    public void getDeviceListSuccess(UserDeviceBean userDeviceBean) {

        switch (userDeviceBean.getCode()){
            case 200:

                List<UserDeviceBean.DataBean> data = userDeviceBean.getData();
                mList.clear();
                mList.addAll(data);
                mAdapter.notifyDataSetChanged();

                break;

        }

    }
}
