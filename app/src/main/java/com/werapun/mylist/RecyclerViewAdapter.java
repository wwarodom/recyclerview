package com.werapun.mylist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewAdapter
        extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    LayoutInflater mLayoutInflater;
    String [] list;
    ItemClickListener mItemClickListener;

    public RecyclerViewAdapter(Context context, String[] list) {
        mLayoutInflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.listview_row,parent,false);
         ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvName.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public String getItem(int position) {
        return list[position];
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mItemClickListener = itemClickListener;
    }


    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        protected TextView tvName;
        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mItemClickListener != null )
                mItemClickListener.onItemClick(v,getAdapterPosition());
        }
    }
}
