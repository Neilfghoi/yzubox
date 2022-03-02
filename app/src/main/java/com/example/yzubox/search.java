package com.example.yzubox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void gotoallsong(View v) {
        Intent it=new Intent(this,allsong.class);
        startActivity(it);
    }

    public void gotodownload(View v) {
        Intent it=new Intent(this,download.class);
        startActivity(it);
    }

    public void gotoallsong(View v) {
        Intent it=new Intent(this,allsong.class);
        startActivity(it);
    }
}