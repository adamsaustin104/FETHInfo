package com.austinadams.fethinfo.TH_Info;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.austinadams.fethinfo.R;

public class Information_List_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_list);
        Intent intent = getIntent();
        //String value = intent.getStringExtra("key");

    }
}