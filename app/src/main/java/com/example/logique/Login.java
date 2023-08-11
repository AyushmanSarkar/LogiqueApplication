package com.example.logique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import android.view.View;
import android.widget.*;

public class Login extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState){


            EditText username;
            EditText password;
            Button loginButton;

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            ActionBar ab = getSupportActionBar();
            ab.hide();

            username = findViewById(R.id.username);
            password = findViewById(R.id.password);
            loginButton = findViewById(R.id.loginButton);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Login.this, Feed.class));}
            });
        }
}