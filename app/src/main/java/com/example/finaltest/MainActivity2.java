package com.example.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    Spinner spinnerCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinnerCountry = (Spinner) findViewById(R.id.spinner_Country);

        List<String> countries = new ArrayList<>();
        countries.add(0, "Choose Country");
        countries.add("CANADA");
        countries.add("USA");
        countries.add("ENGLAND");

        //Styling and populating the spinner
        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerCountry.setAdapter(dataAdapter);


        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose Country")){
                    // Do nothing
                }
                else {
                    // On selecting spinner items
                    String spCountryName = parent.getItemAtPosition(position).toString();

                    Toast.makeText(parent.getContext(), "You have selected " +spCountryName, Toast.LENGTH_SHORT).show();

                    if (parent.getItemAtPosition(position).equals("CANADA")){
                        Intent intent = new Intent(MainActivity2.this, CanadaActivity.class);
                        startActivity(intent);
                        Toast.makeText(parent.getContext(), "Ottawa is the Capital of  " +spCountryName, Toast.LENGTH_SHORT).show();
                    }
                    if (parent.getItemAtPosition(position).equals("ENGLAND")){
                        Intent intent = new Intent(MainActivity2.this, CanadaActivity.class);
                        startActivity(intent);
                        Toast.makeText(parent.getContext(), "London is the capital of  " +spCountryName, Toast.LENGTH_SHORT).show();
                    }
                    if (parent.getItemAtPosition(position).equals("Washington is the capital of ")){
                        Intent intent = new Intent(MainActivity2.this, CanadaActivity.class);
                        startActivity(intent);
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}