package com.example.yzubox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
    }

    public void gotoallsong(View v) {
        Intent it=new Intent(this,allsong.class);
        startActivity(it);
    }

    public void gotodownload(View v) {
        Intent it=new Intent(this,download.class);
        startActivity(it);
    }

    public void gotoplay(View v) {
        Intent it=new Intent(this,play.class);
        startActivity(it);
    }

    public void gotofavorite(View v) {
        Intent it=new Intent(this,favorite_music.class);
        startActivity(it);
    }

    public void gotoroom(View v) {
        Intent it=new Intent(this,room.class);
        startActivity(it);
    }

    public void gotofindoutter(View v) {
        Intent it=new Intent(this,find_outter.class);
        startActivity(it);
    }

    public void gotosetting(View v) {
        Intent it=new Intent(this,setting.class);
        startActivity(it);
    }

}