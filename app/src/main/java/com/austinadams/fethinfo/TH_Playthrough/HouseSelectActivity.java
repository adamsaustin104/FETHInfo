package com.austinadams.fethinfo.TH_Playthrough;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import com.austinadams.fethinfo.R;

public class HouseSelectActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.house_select);
        Intent intent = getIntent();
        //String value = intent.getStringExtra("key");

    }
}
