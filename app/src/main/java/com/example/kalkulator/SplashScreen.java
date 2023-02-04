package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.kalkulator.Activity2;
import com.example.kalkulator.MainActivity;
import com.example.kalkulator.R;

public class SplashScreen extends AppCompatActivity {

    public static final String SHARED_PREFS = "shared_prefs";
    public static final String EMAIL_KEY = "email_key";
    public static final String PASSWORD_KEY = "password_key";

    SharedPreferences sharedpreferences;
    String email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sharedpreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        email = sharedpreferences.getString(EMAIL_KEY, null);
        password = sharedpreferences.getString(PASSWORD_KEY, null);

        if (email != null && password != null) {
            Intent i = new Intent(SplashScreen.this, Activity2.class);
            startActivity(i);
        }else{
            Intent i = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(i);
        }
        finish();

    }
}