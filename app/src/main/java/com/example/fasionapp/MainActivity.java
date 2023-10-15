package com.example.fasionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Widgets and Variables
    private RecyclerView staggeredRV;
    private RecyclerViewAdaptery adapter;
    private StaggeredGridLayoutManager manager;
    private List<row> appList;



    // Images for cards

    //I WILL ADD SOME DRAWBALES
    // All Drawables and XD FILES ARE AVAILABLE IN the description below
    // ALSO THE SOURCE CODE of ANDROID STUDIO
    int[] covers = new int[]{
            R.drawable.fash1,
            R.drawable.fash2,
            R.drawable.fash3,
            R.drawable.fash4,
            R.drawable.fash5,
            R.drawable.fash6,
            R.drawable.images
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1- initializing the views
        staggeredRV = findViewById(R.id.recyclerView);

        // 2- Getting data
        appList = new ArrayList<>();

        // 3- Creating Adapter
        adapter = new RecyclerViewAdaptery(this,appList);
        manager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);

        // 4- set layoutManager
        staggeredRV.setLayoutManager(manager);

        // 5- Set an adapter
        staggeredRV.setAdapter(adapter);

        // 6- inserting data
        IntializeDataIntoRecyclerView();


        // 7- Run the app and see if there is an error

        // Amazing. let's add the final touches


    }

    private void IntializeDataIntoRecyclerView() {

        row a = new row(covers[0] , "Box Tee");
        appList.add(a);

        a = new row(covers[1],"Boyfriend Tee");
        appList.add(a);

        a = new row(covers[2], "Boyfriend Tee");
        appList.add(a);

        a = new row(covers[3], "Shirt Sleeve");
        appList.add(a);

        a = new row(covers[4], "Boyfriend Tee");
        appList.add(a);

        a = new row(covers[5], "Shirt Sleeve");
        appList.add(a);

        a = new row(covers[6], "Image");
        appList.add(a);

        adapter.notifyDataSetChanged();


    }
}