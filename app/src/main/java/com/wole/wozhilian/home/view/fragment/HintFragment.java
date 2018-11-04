package com.wole.wozhilian.home.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wole.wozhilian.R;
import com.wole.wozhilian.home.adapter.RcyFaultDevicesAdapter;

/**
 * Created by Administrator on 2018/9/13.
 */

public class HintFragment extends Fragment {

    private RecyclerView mRcyFaultList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_hint_view, null);

        initView(inflate);

        initData();

        initEvent();

        return inflate;
    }

    private void initEvent() {

    }

    private void initData() {
        RcyFaultDevicesAdapter adapter = new RcyFaultDevicesAdapter(getActivity(), null);
        mRcyFaultList.setAdapter(adapter);
    }

    private void initView(View inflate) {
        mRcyFaultList = inflate.findViewById(R.id.rcy_fault_list);
        mRcyFaultList.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRcyFaultList.setNestedScrollingEnabled(false);
    }
}
