package com.example.faiz.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // Populating our data set
        List<ColorDataItem> dataItems = new ArrayList<ColorDataItem>();
        dataItems.add(new ColorDataItem("Indigo", "#3F51B5"));
        dataItems.add(new ColorDataItem("Pink", "#E91E63"));
        dataItems.add(new ColorDataItem("Orange", "#FF5722"));
        dataItems.add(new ColorDataItem("Green", "#4CAF50"));
        dataItems.add(new ColorDataItem("Grey", "#607D8B"));
        dataItems.add(new ColorDataItem("Cyan", "#00BCD4"));
        dataItems.add(new ColorDataItem("Amber", "#FFC107"));
        dataItems.add(new ColorDataItem("Brown", "#795548"));
        dataItems.add(new ColorDataItem("Blue", "#03A9F4"));
        dataItems.add(new ColorDataItem("Red", "#F44336"));

        // Creating new adapter object
        MyAdapter myAdapter = new MyAdapter(dataItems);
        recyclerView.setAdapter(myAdapter);

        // Setting the layoutManager
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }

    }

