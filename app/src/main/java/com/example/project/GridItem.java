package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class GridItem extends AppCompatActivity {
   GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        gridView=findViewById(R.id.grid);
        List<Integer> images=new ArrayList<>();
        List<Integer> names=new ArrayList<>();

        images.add(R.drawable.a);
        images.add(R.drawable.b);
        images.add(R.drawable.c);
        images.add(R.drawable.d);
        names.add("Potato");
        names.add("Tomato");
        names.add("Onion");
        names.add("Carrot");

        ProductAdapter apdater=new ProductAdapter(applicationContext:this,images,names);
        gridView.setAdapter(adapter);


    }
}
