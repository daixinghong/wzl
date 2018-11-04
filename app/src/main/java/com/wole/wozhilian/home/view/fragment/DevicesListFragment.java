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

/**
 * Created by Administrator on 2018/9/14.
 */

public class DevicesListFragment extends Fragment {

    private RecyclerView mRcyDevicesList;
    private RcyDevicesListAdapter mAdapter;

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
        mAdapter = new RcyDevicesListAdapter(getActivity(), null);
        mRcyDevicesList.setAdapter(mAdapter);
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


}
