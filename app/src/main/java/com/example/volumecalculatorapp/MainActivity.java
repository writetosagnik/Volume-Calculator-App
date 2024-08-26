package com.example.volumecalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //Adapter view - GridView
    GridView gridView;

    //data source
    ArrayList<Shape> shapeArrayList;

    //
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);
        shapeArrayList=new ArrayList<>();

        Shape s1=new Shape(R.drawable.sphere,"Sphere");
        Shape s2=new Shape(R.drawable.cube,"Cube");
        Shape s3=new Shape(R.drawable.cuboid,"Cuboid");
        Shape s4=new Shape(R.drawable.pyramid,"Pyramid");
        Shape s5=new Shape(R.drawable.cylinder,"Cylinder");
        Shape s6=new Shape(R.drawable.cone,"Cone");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);
        shapeArrayList.add(s5);
        shapeArrayList.add(s6);


        adapter = new MyCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0) {
                    Intent i = new Intent(getApplicationContext(), SphereActivity.class);
                    startActivity(i);
                } else if (position ==1) {
                    Intent i=new Intent(getApplicationContext(),CubeActivity.class);
                    startActivity(i);
                } else if (position ==2) {
                    Intent i = new Intent(getApplicationContext(), CuboidActivity.class);
                    startActivity(i);
                }else if (position == 3) {
                    Intent i=new Intent(getApplicationContext(),PyramidActivity.class);
                    startActivity(i);
                } else if (position ==4) {
                    Intent i=new Intent(getApplicationContext(),CylinderActivity.class);
                    startActivity(i);
                } else if (position ==5) {
                    Intent i=new Intent(getApplicationContext(),ConeActivity.class);
                    startActivity(i);


                }
            }
        });
    }
}