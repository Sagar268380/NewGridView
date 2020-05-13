package com.example.newgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<PackagesModel>packagesModelList;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleview);

        packagesModelList= new ArrayList<>();


        packagesModelList.add(new PackagesModel(R.drawable.image3,"310"));
        packagesModelList.add(new PackagesModel(R.drawable.image4,"410"));
        packagesModelList.add(new PackagesModel(R.drawable.image5,"110"));
        packagesModelList.add(new PackagesModel(R.drawable.image6,"300"));
        packagesModelList.add(new PackagesModel(R.drawable.image7,"510"));
        packagesModelList.add(new PackagesModel(R.drawable.image8,"210"));
        packagesModelList.add(new PackagesModel(R.drawable.image9,"250"));
        packagesModelList.add(new PackagesModel(R.drawable.image5,"410"));
        packagesModelList.add(new PackagesModel(R.drawable.image3,"100"));
        packagesModelList.add(new PackagesModel(R.drawable.image3,"150"));


        adapter = new MyAdapter(this,packagesModelList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);


    }
}