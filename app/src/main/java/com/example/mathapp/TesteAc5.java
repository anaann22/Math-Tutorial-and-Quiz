package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TesteAc5 extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studiu_ac5);

        final LinearLayout nrNat = findViewById(R.id.nrNat);
        final LinearLayout nrZec = findViewById(R.id.nrZec);
        final LinearLayout Fractii = findViewById(R.id.Fractii);
        final LinearLayout linii = findViewById(R.id.linii);

        final Button startbtn = findViewById(R.id.start);


        nrNat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Numere Naturale";
                nrNat.setBackgroundResource(R.drawable.round_back_white_stroke);
                nrZec.setBackgroundResource(R.drawable.round_back_white_stroke);
                Fractii.setBackgroundResource(R.drawable.round_back_white_stroke);
                linii.setBackgroundResource(R.drawable.round_back_white_stroke);

                // Deschide activitatea Clasa5
                Intent intent = new Intent(TesteAc5.this, QuizActivity.class);
                startActivity(intent);
            }
        });


        nrZec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Numere Zecimale";
                nrNat.setBackgroundResource(R.drawable.round_back_white_stroke);
                nrZec.setBackgroundResource(R.drawable.round_back_white_stroke);
                Fractii.setBackgroundResource(R.drawable.round_back_white_stroke);
                linii.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });

        Fractii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Fractii";
                nrNat.setBackgroundResource(R.drawable.round_back_white_stroke);
                nrZec.setBackgroundResource(R.drawable.round_back_white_stroke);
                Fractii.setBackgroundResource(R.drawable.round_back_white_stroke);
                linii.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });

        linii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Linii si Puncte";
                nrNat.setBackgroundResource(R.drawable.round_back_white_stroke);
                nrZec.setBackgroundResource(R.drawable.round_back_white_stroke);
                Fractii.setBackgroundResource(R.drawable.round_back_white_stroke);
                linii.setBackgroundResource(R.drawable.round_back_white_stroke);


            }
        });
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(TesteAc5.this, "Vă rugăm să selectați un domeniu", Toast.LENGTH_SHORT).show();
                } else {
                    // Deschide activitatea corespunzătoare domeniului selectat
                    if (selectedTopicName.equals("Numere Zecimale")) {
                        // Deschide activitatea Clasa6
                        Intent intent = new Intent(TesteAc5.this, QuizZecimal5.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Fractii")) {
                        // Deschide activitatea Clasa7
                        Intent intent = new Intent(TesteAc5.this, QuizFractii.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Linii si Puncte")) {
                        // Deschide activitatea Clasa8
                        Intent intent = new Intent(TesteAc5.this, LiniiActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
};