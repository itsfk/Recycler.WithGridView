package com.example.faiz.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Faiz on 8/9/2017.
 */

public class MyAdapter extends RecyclerView.Adapter {
    private List<ColorDataItem> dataItems;

    // Adapter constructor
    public MyAdapter(List<ColorDataItem> dataItems) {

        this.dataItems = dataItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View layoutView = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.item_layout, null);
        return new MyViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        ColorDataItem dataItem = dataItems.get(position);
        // Casting the viewHolder to MyViewHolder so I could interact with the views
        MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
        myViewHolder.colorBlock.setBackgroundColor(dataItem.getColor());
        myViewHolder.colorName.setText(dataItem.getName());
    }

    @Override
    public int getItemCount() {

        return dataItems.size();
    }

    /** This is our ViewHolder class */
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView colorName;
        public View colorBlock;

        public MyViewHolder(View itemView) {
            super(itemView); // Must call super() first
            colorName = (TextView) itemView.findViewById(R.id.colorName);
            colorBlock = (View) itemView.findViewById(R.id.colorBlock);

        }
    }

}
