package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    String et1;
    String et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(v->{
            gotoMain2();
        });

        binding.btn2.setOnClickListener(v->{
            showDialog();
        });

    }


    private void gotoMain2() {


        et1 = binding.et1.getText().toString();
        et2 = binding.et2.getText().toString();


        Intent intent = new Intent();
        intent.setAction("android.intent.action.editTexts");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        Bundle bundle = new Bundle();

        if(et1!=null && et2!=null){
            bundle.putInt("e",(Integer.parseInt(et1)+Integer.parseInt(et2)));
        }

        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void showDialog(){


        int e1 = Integer.parseInt(binding.et1.getText().toString());
        int e2 = Integer.parseInt(binding.et2.getText().toString());

        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(MainActivity.this);
        normalDialog.setTitle("我是一个普通Dialog");


        normalDialog.setMessage("值为："+(e1+e2));

        // 显示
        normalDialog.show();
    }
}