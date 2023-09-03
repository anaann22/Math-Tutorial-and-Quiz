package com.example.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class StudioAc7 extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studio_ac7);

        final LinearLayout Geo = findViewById(R.id.Geo);
        final LinearLayout rad = findViewById(R.id.rad);
        final LinearLayout pitagora = findViewById(R.id.pitagora);
        final LinearLayout sincos = findViewById(R.id.sincos);

        final Button startbtn = findViewById(R.id.start);


        Geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Geometrie";
                Geo.setBackgroundResource(R.drawable.round_back_white_stroke);
                rad.setBackgroundResource(R.drawable.round_back_white_stroke);
                pitagora.setBackgroundResource(R.drawable.round_back_white_stroke);
                sincos.setBackgroundResource(R.drawable.round_back_white_stroke);


                // Deschide activitatea Clasa5
                Intent intent = new Intent(StudioAc7.this, PDFGEO7.class);
                startActivity(intent);
            }
        });


        rad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Radicali";
                Geo.setBackgroundResource(R.drawable.round_back_white_stroke);
                rad.setBackgroundResource(R.drawable.round_back_white_stroke);
                pitagora.setBackgroundResource(R.drawable.round_back_white_stroke);
                sincos.setBackgroundResource(R.drawable.round_back_white_stroke);



            }
        });

        pitagora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Pitagora";
                Geo.setBackgroundResource(R.drawable.round_back_white_stroke);
                rad.setBackgroundResource(R.drawable.round_back_white_stroke);
                pitagora.setBackgroundResource(R.drawable.round_back_white_stroke);
                sincos.setBackgroundResource(R.drawable.round_back_white_stroke);



            }
        });

        sincos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Sin - Cos";
                Geo.setBackgroundResource(R.drawable.round_back_white_stroke);
                rad.setBackgroundResource(R.drawable.round_back_white_stroke);
                pitagora.setBackgroundResource(R.drawable.round_back_white_stroke);
                sincos.setBackgroundResource(R.drawable.round_back_white_stroke);



            }
        });
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(StudioAc7.this, "Vă rugăm să selectați un domeniu", Toast.LENGTH_SHORT).show();
                } else {
                    // Deschide activitatea corespunzătoare domeniului selectat
                    if (selectedTopicName.equals("Radicali")) {
                        // Deschide activitatea Clasa6
                        Intent intent = new Intent(StudioAc7.this, PDFRADICALI.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Pitagora")) {
                        // Deschide activitatea Clasa7
                        Intent intent = new Intent(StudioAc7.this, PDFPITAGORA.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Sin - Cos")) {
                        Intent intent = new Intent(StudioAc7.this, PDFSINCOS.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}