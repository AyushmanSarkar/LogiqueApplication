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
                gotourl("https://en.wikipedia.org/wiki/Mukesh_Ambani%22");
            }
        });


        Button b;
        ImageView prof;
        TextView t;
        b = findViewById(R.id.btnN);
        prof = findViewById(R.id.img_viewProfPic2);
        t = findViewById(R.id.textProf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setBackgroundResource(R.drawable.adani);

                prof.setImageResource(R.drawable.ic_profile2);
                t.setText("Gautam Adani");
            }
        });
    }
    private void gotourl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
