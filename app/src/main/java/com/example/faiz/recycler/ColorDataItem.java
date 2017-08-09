package com.example.faiz.recycler;

import android.graphics.Color;

/**
 * Created by Faiz on 8/9/2017.
 */

public class ColorDataItem {
    private String name;
    private int color;

    public ColorDataItem(String name, String color) {
        this.name = name;
        this.color = Color.parseColor(color);
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

}
