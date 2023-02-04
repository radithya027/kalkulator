package com.example.kalkulator;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String SHARED_PREFS = "shared_prefs";

    public static final String EMAIL_KEY = "email_key";

    public static final String PASSWORD_KEY = "password_key";

    SharedPreferences sharedpreferences;
    String email, password;

    //list widget yang akan dikenakan aksi
    EditText txtUsername;
    EditText txtPassword;
    public void onClick(View view) {
        String password = txtPassword.getText().toString();
        if (txtUsername.equalsIgronoreCase("admin") &&
                password.equalsIgnoreCase("admin")){
            sharedpreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();

            // below two lines will put values for
            // email and password in shared preferences.
            editor.putString(EMAIL_KEY, txtUsername.getText().toString());
            editor.putString(PASSWORD_KEY, txtPassword.getText().toString());

            // to save our data with key and value.
            editor.apply();
            startActivity(new Intent(MainActivity.this, MainActivity.class));
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "Gagal Login", Toast.LENGTH_SHORT).show();
        }
    }
}