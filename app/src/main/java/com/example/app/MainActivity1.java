package com.example.app;

import android.content.Intent;
import android.os.Bundle;

import com.example.app.databinding.ActivityMain1Binding;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    public ActivityMain1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int result = bundle.getInt("e");

        binding.tv.setText(""+result);

    }
}