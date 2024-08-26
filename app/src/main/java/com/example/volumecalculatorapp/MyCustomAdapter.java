package com.example.volumecalculatorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

//This class will be essential to create each view and bind the data to it

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout,shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }


    //viewHolder class : used to cache the references for the unused view elements
    public static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }

    //GetView() : used to create and return a view for a specific item in grid

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //1. shape object for the current position
        Shape shape=getItem(position);

        //2. Inflating layout.
        MyViewHolder myViewHolder;

        if(convertView ==null) {
            //no view went of the screen --> create new view
            myViewHolder=new MyViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            //finding the viewa
            myViewHolder.shapeName=(TextView)  convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg=(ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);
        }else
        {
            //a view went off screen --> recycle it
            myViewHolder=(MyViewHolder) convertView.getTag();



            }

            myViewHolder.shapeName.setText(shape.getShapeName());
            myViewHolder.shapeImg.setImageResource(shape.getShapeImg());

            return convertView;



    }
}
