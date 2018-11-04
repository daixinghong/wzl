package com.wole.wozhilian.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wole.wozhilian.R;

import java.util.List;

/**
 * Created by Administrator on 2018/9/14.
 */

public class RcyDevicesListAdapter extends RecyclerView.Adapter<RcyDevicesListAdapter.DevicesHoder> {

    private Context mContext;
    private List<String> mList;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void setOnItemClickListener(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public RcyDevicesListAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public DevicesHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        DevicesHoder holder = new DevicesHoder(LayoutInflater.from(
                mContext).inflate(R.layout.rcy_devices_item, null,
                false), mOnItemClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(DevicesHoder holder, final int position) {


    }


    @Override
    public int getItemCount() {
        return mList == null ? 6 : mList.size();
    }


    class DevicesHoder extends RecyclerView.ViewHolder implements View.OnClickListener {

        OnItemClickListener mOnItemClickListener;

        public DevicesHoder(View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.mOnItemClickListener = onItemClickListener;
        }


        @Override
        public void onClick(View view) {
            if (mOnItemClickListener != null)
                mOnItemClickListener.setOnItemClickListener(view, getPosition());

        }
    }

}
