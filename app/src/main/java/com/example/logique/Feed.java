package com.example.logique;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.net.Uri;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class Feed extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_feed);

        ImageButton btn;
        btn = findViewById(R.id.btnImg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://en.wikipedia.org/wiki/Gautam_Adani%22");
            }
        });

        Button b = findViewById(R.id.proceedHelpDesk);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Feed.this, HelpDesk.class));}
        });
    }
    private void gotourl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
