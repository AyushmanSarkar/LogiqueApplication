package com.example.logique;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.net.Uri;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Feed extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_feed);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Successful Entrepreneurs of India");

        Button help;
        help = findViewById(R.id.helpBtn);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Feed.this, HelpDesk.class));}
        });
        ImageButton oyo;
        oyo = findViewById(R.id.oyo);
        oyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://en.wikipedia.org/wiki/Ritesh_Agarwal");
            }
        });


        ImageButton infosys;
        infosys = findViewById(R.id.infosys);
        infosys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://en.wikipedia.org/wiki/N._R._Narayana_Murthy");
            }
        });

        ImageButton adani;
        adani = findViewById(R.id.adani);
        adani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://en.wikipedia.org/wiki/Gautam_Adani");
            }
        });

        ImageButton paytm;
        paytm = findViewById(R.id.paytm);
        paytm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://en.wikipedia.org/wiki/Vijay_Shekhar_Sharma");
            }
        });



    }
    private void gotourl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
