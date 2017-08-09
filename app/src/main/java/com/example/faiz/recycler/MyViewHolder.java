package com.example.faiz.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Faiz on 8/9/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView colorName;
    public View colorBlock;

    public MyViewHolder(View itemView) {
        super(itemView); // Must call super() first
        colorName = (TextView) itemView.findViewById(R.id.colorName);
        colorBlock = (View) itemView.findViewById(R.id.colorBlock);
    }


}
