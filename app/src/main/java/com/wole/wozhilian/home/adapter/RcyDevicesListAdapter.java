package com.wole.wozhilian.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wole.wozhilian.R;
import com.wole.wozhilian.home.model.bean.UserDeviceBean;

import java.util.List;

/**
 * Created by Administrator on 2018/9/14.
 */

public class RcyDevicesListAdapter extends RecyclerView.Adapter<RcyDevicesListAdapter.DevicesHoder> {

    private Context mContext;
    private List<UserDeviceBean.DataBean> mList;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener {
        void setOnItemClickListener(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public RcyDevicesListAdapter(Context context, List<UserDeviceBean.DataBean> list) {
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

//        holder.mTvDeviceName.setText(mList.get(position).getEquipment_name());
//        holder.mTvOutCount.setText(mList.get(position).getN);


    }


    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


    class DevicesHoder extends RecyclerView.ViewHolder implements View.OnClickListener {

        OnItemClickListener mOnItemClickListener;
        private final TextView mTvDeviceName;
        private final TextView mTvOutCount;
        private final TextView mTvOrderNumber;
        private final TextView mTvOpreateUser;
        private final TextView mTvDeviceStatus;

        public DevicesHoder(View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);

            mTvDeviceName = itemView.findViewById(R.id.tv_devices_name);
            mTvOutCount = itemView.findViewById(R.id.tv_out_count);
            mTvOrderNumber = itemView.findViewById(R.id.tv_order_number);
            mTvOpreateUser = itemView.findViewById(R.id.tv_opreate_user);
            mTvDeviceStatus = itemView.findViewById(R.id.tv_devices_state);

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
