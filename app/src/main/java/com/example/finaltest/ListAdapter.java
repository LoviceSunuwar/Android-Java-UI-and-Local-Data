package com.example.finaltest;

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

public class ListAdapter extends ArrayAdapter<PlaceCanada> {

    public ListAdapter(Context context, ArrayList<PlaceCanada>c_placeArrayList){
        super(context, R.layout.canada_placelist,c_placeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        PlaceCanada placeCanada = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.canada_placelist,parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.c_placepicture);
        TextView placename = convertView.findViewById(R.id.canadaplace);
        TextView placedesc = convertView.findViewById(R.id.canadadesc);
        TextView price = convertView.findViewById(R.id.canadaprice);
        String can_price = String.valueOf(placeCanada.c_price);

        imageView.setImageResource(placeCanada.c_image);
        placedesc.setText(placeCanada.c_description);
        placename.setText(placeCanada.c_name);
        price.setText(can_price);


        return convertView;
    }
}
