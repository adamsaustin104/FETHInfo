package com.austinadams.fethinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.austinadams.fethinfo.TH_Info.Information_List_Activity;
import com.austinadams.fethinfo.TH_Playthrough.HouseSelectActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnPlaythrough;
    private ImageButton btnInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlaythrough = findViewById(R.id.btnPlaythrough);
        btnInformation = findViewById(R.id.btnInformation);

        btnPlaythrough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, HouseSelectActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Information_List_Activity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });


    }
}
