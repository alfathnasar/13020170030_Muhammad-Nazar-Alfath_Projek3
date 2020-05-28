package com.example.bangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private String data;
    private Button hitung;
    private TextView title, rumus1, rumus2, hasil;
    private EditText nilai1, nilai2;
    private float bil1, bil2, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        title = findViewById(R.id.title);
        rumus1 = findViewById(R.id.rumus1);
        rumus2 = findViewById(R.id.rumus2);
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        hitung = findViewById(R.id.hitung);
        hasil = findViewById(R.id.hasil);

        data =getIntent().getExtras().getString("data1");
        if (data.equals("belah")){
            getSupportActionBar().setTitle("Hitung Luas Belah Ketupat");
            title.setText("Belah Ketupat");
            rumus1.setText("Diagonal 1");
            rumus2.setText("Diagonal 2");
            hitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bil1 = Float.parseFloat(nilai1.getText().toString());
                    bil2 = Float.parseFloat(nilai2.getText().toString());
                    luas =(bil1 * bil2)/2;
                    hasil.setText("Luasnya adalah "+String.valueOf(luas));
                }
            });
        }else if (data.equals("trapesium")){
            getSupportActionBar().setTitle("Hitung Luas Trapesium");
            title.setText("Trapesium");
            rumus1.setText("Diagonal 1");
            rumus2.setText("Diagonal 2");
            hitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bil1 = Float.parseFloat(nilai1.getText().toString());
                    bil2 = Float.parseFloat(nilai2.getText().toString());
                    luas =(bil1 * bil2)/2;
                    hasil.setText("Luasnya adalah "+String.valueOf(luas));
                }
            });
        }else if (data.equals("segitiga")){
            getSupportActionBar().setTitle("Hitung Luas Segitiga");
            title.setText("Segitiga");
            rumus1.setText("Alas");
            rumus2.setText("Tinggi");
            hitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bil1 = Float.parseFloat(nilai1.getText().toString());
                    bil2 = Float.parseFloat(nilai2.getText().toString());
                    luas =(bil1 * bil2)/2;
                    hasil.setText("Luasnya adalah "+String.valueOf(luas));
                }
            });
        }else if (data.equals("layang")){
            getSupportActionBar().setTitle("Hitung Luas Layang-Layang");
            title.setText("Layang-Layang");
            rumus1.setText("Diagonal 1");
            rumus2.setText("Diagonal 2");
            hitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bil1 = Float.parseFloat(nilai1.getText().toString());
                    bil2 = Float.parseFloat(nilai2.getText().toString());
                    luas =(bil1 * bil2)/2;
                    hasil.setText("Luasnya adalah "+String.valueOf(luas));
                }
            });
        }
    }
}
