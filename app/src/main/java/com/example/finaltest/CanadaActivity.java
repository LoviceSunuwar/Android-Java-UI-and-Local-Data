package com.example.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.finaltest.databinding.ActivityCanadaBinding;

import java.util.ArrayList;

public class CanadaActivity extends AppCompatActivity {

    ActivityCanadaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCanadaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageView = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4};
        String[] placename = {"Niagra falls", "CN Tower", "The Butchart Gardens", "Notre-Dame Basilica"};
        String[] placedesc = {"Niagara Falls, Ontario, is a Canadian city at the famous waterfalls of the same name, linked with the U.S. by the Rainbow Bridge. Its site on the Niagara River's western shore overlooks the Horseshoe Falls, the cascades' most expansive section. Elevators take visitors to a lower, wetter vantage point behind the falls. A cliffside park features a promenade alongside 520-ft.-high Skylon Tower with an observation deck.", "The CN Tower is a 553.3 m-high concrete communications and observation tower located in the downtown core of Toronto, Ontario, Canada. Built on the former Railway Lands, it was completed in 1976. Its name \"CN\" originally referred to Canadian National, the railway company that built the tower.", "The Butchart Gardens is a group of floral display gardens in Brentwood Bay, British Columbia, Canada, located near Victoria on Vancouver Island. The gardens receive over a million visitors each year. The gardens have been designated a National Historic Site of Canada.", "Notre-Dame de Paris, referred to simply as Notre-Dame, is a medieval Catholic cathedral on the Île de la Cité, in the 4th arrondissement of Paris. The cathedral, dedicated to the Virgin Mary, is considered one of the finest examples of French Gothic architecture."};
        Double[] price = {100.00, 30.00, 30.00, 50.00};

        ArrayList<PlaceCanada> c_placeArrayList = new ArrayList<>();

        for (int i = 0 ;i < imageView.length; i++){

            PlaceCanada placeCanada = new PlaceCanada(placename[i],placedesc[i],imageView[i],price[i]);
            c_placeArrayList.add(placeCanada);
        }

        ListAdapter listAdapter = new ListAdapter(CanadaActivity.this,c_placeArrayList);

        binding.canadaListview.setAdapter(listAdapter);
        binding.canadaListview.setClickable(true);
        binding.canadaListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(CanadaActivity.this,DescActivity.class);
                i.putExtra("name",placename[position]);
                i.putExtra("description",placedesc[position]);
                i.putExtra("price",price[position]);
                i.putExtra("imageId",imageView[position]);
                startActivity(i);

            }
        });
    }
}