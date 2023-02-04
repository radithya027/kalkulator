package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    EditText angka_pertama,angka_kedua;
    Button tambah, kurang, kali, bagi;
    TextView txtHasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        angka_pertama = (EditText) findViewById(R.id.txtAngkapertama);
        angka_kedua = (EditText) findViewById(R.id.txtAngkakedua);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        tambah = (Button) findViewById(R.id.btnTambah);
        kurang = (Button) findViewById(R.id.btnKurang);
        kali = (Button) findViewById(R.id.btnKali);
        bagi = (Button) findViewById(R.id.btnBagi);


        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(angka_pertama.getText().toString());
                int nilaiB = Integer.parseInt(angka_kedua.getText().toString());

                int hasil = nilaiA + nilaiB;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "hasilnya adalah " + hasil, Toast.LENGTH_SHORT).show();
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(angka_pertama.getText().toString());
                int nilaiB = Integer.parseInt(angka_kedua.getText().toString());

                int hasil = nilaiA - nilaiB;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "hasilnya adalah " + hasil, Toast.LENGTH_SHORT).show();
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(angka_pertama.getText().toString());
                int nilaiB = Integer.parseInt(angka_kedua.getText().toString());

                int hasil = nilaiA * nilaiB;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "hasilnya adalah " + hasil, Toast.LENGTH_SHORT).show();
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nilaiA = Integer.parseInt(angka_pertama.getText().toString());
                double nilaiB = Integer.parseInt(angka_kedua.getText().toString());

                double hasil = nilaiA / nilaiB;
                txtHasil.setText(String.valueOf(hasil));
                Toast.makeText(getApplicationContext(), "hasilnya adalah " + hasil, Toast.LENGTH_SHORT).show();
            }
            public void onClick(DialogInterface dialog, int which){
                startActivity(new Intent(Activity2.this,Activity2.class));
            }
        });
    }
}

