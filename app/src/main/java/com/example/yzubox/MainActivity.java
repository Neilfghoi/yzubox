package com.example.yzubox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotomine(View v) {
        Intent it=new Intent(this,mine.class);
        startActivity(it);
    }

    public void gotoregister(View v) {
        Intent it=new Intent(this,register.class);
        startActivity(it);
    }

    public void gotoforget(View v) {
        Intent it=new Intent(this,forget.class);
        startActivity(it);
    }

}