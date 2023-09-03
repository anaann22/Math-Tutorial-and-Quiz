package com.example.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout cl5 = findViewById(R.id.cl5);
        final LinearLayout cl6 = findViewById(R.id.cl6);
        final LinearLayout cl7 = findViewById(R.id.cl7);
        final LinearLayout cl8 = findViewById(R.id.cl8);

        final Button startbtn = findViewById(R.id.start);


        cl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Clasa 5";
                cl5.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl6.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl7.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl8.setBackgroundResource(R.drawable.round_back_white_stroke);

                // Deschide activitatea Clasa5
                Intent intent = new Intent(MainActivity.this, CL5Activity.class);
                startActivity(intent);
            }
        });


        cl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Clasa 6";
                cl5.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl6.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl7.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl8.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });

        cl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Clasa 7";
                cl5.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl6.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl7.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl8.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });

        cl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Clasa 8";
                cl5.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl6.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl7.setBackgroundResource(R.drawable.round_back_white_stroke);
                cl8.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vă rugăm să selectați un domeniu", Toast.LENGTH_SHORT).show();
                } else {
                    // Deschide activitatea corespunzătoare domeniului selectat
                    if (selectedTopicName.equals("Clasa 6")) {
                        // Deschide activitatea Clasa6
                        Intent intent = new Intent(MainActivity.this, CL6Activity.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Clasa 7")) {
                        // Deschide activitatea Clasa7
                        Intent intent = new Intent(MainActivity.this, CL7Activity.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Clasa 8")) {
                        // Deschide activitatea Clasa8
                        Intent intent = new Intent(MainActivity.this, CL8Activity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
};