package com.example.finaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.finaltest.databinding.ActivityCanadaBinding;
import com.example.finaltest.databinding.ActivityDescBinding;

public class DescActivity extends AppCompatActivity {

  ActivityDescBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDescBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){
            String name = intent.getStringExtra("name");
            String description = intent.getStringExtra("description");
            String price = intent.getStringExtra("price");
            int imageid = intent.getIntExtra("imageid", R.drawable.c1);

            binding.descName.setText(name);
            binding.descDescription.setText(description);
            binding.descprice.setText(price);
            binding.descimage.setImageResource(imageid);
        }
    }
}