package com.example.bangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView info;
    private Button belah,segitiga,trape,layang;
    private String bel="belah",seg="segitiga",tra="trapesium",lay="layang";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = findViewById(R.id.info);
        belah = findViewById(R.id.belah);
        trape = findViewById(R.id.trape);
        segitiga = findViewById(R.id.segitiga);
        layang = findViewById(R.id.layang);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

        belah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new Intent(MainActivity.this, Main3Activity.class));
                intent.putExtra("data1", bel);
                startActivity(intent);
            }
        });

        trape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new Intent(MainActivity.this, Main3Activity.class));
                intent.putExtra("data1", tra);
                startActivity(intent);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new Intent(MainActivity.this, Main3Activity.class));
                intent.putExtra("data1", seg);
                startActivity(intent);
            }
        });

        layang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(new Intent(MainActivity.this, Main3Activity.class));
                intent.putExtra("data1", lay);
                startActivity(intent);
            }
        });
    }
}
