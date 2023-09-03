package com.example.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CL8Activity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cl8);

        final LinearLayout test1 = findViewById(R.id.test1);
        final LinearLayout test2 = findViewById(R.id.test2);
        final LinearLayout test3 = findViewById(R.id.test3);
        final LinearLayout test4 = findViewById(R.id.test4);

        final Button startbtn = findViewById(R.id.start);


        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Examen 2018";
                test1.setBackgroundResource(R.drawable.round_back_white_stroke);
                test2.setBackgroundResource(R.drawable.round_back_white_stroke);
                test3.setBackgroundResource(R.drawable.round_back_white_stroke);
                test4.setBackgroundResource(R.drawable.round_back_white_stroke);

                // Deschide activitatea Clasa5
                Intent intent = new Intent(CL8Activity.this, PDFEX2018.class);
                startActivity(intent);
            }
        });


        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Examen 2019";
                test1.setBackgroundResource(R.drawable.round_back_white_stroke);
                test2.setBackgroundResource(R.drawable.round_back_white_stroke);
                test3.setBackgroundResource(R.drawable.round_back_white_stroke);
                test4.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });

        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Examen 2020";
                test1.setBackgroundResource(R.drawable.round_back_white_stroke);
                test2.setBackgroundResource(R.drawable.round_back_white_stroke);
                test3.setBackgroundResource(R.drawable.round_back_white_stroke);
                test4.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });

        test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Examen 2021";
                test1.setBackgroundResource(R.drawable.round_back_white_stroke);
                test2.setBackgroundResource(R.drawable.round_back_white_stroke);
                test3.setBackgroundResource(R.drawable.round_back_white_stroke);
                test4.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(CL8Activity.this, "Vă rugăm să selectați un domeniu", Toast.LENGTH_SHORT).show();
                } else {
                    // Deschide activitatea corespunzătoare domeniului selectat
                    if (selectedTopicName.equals("Examen 2019")) {
                        // Deschide activitatea Clasa6
                        Intent intent = new Intent(CL8Activity.this, PDFEX2019.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Examen 2020")) {
                        // Deschide activitatea Clasa7
                        Intent intent = new Intent(CL8Activity.this, PDFEX2020.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Examen 2021")) {
                        // Deschide activitatea Clasa8
                        Intent intent = new Intent(CL8Activity.this, PDFEX2021.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
};