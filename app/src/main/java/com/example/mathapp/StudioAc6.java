package com.example.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class StudioAc6 extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studio_ac6);

        final LinearLayout nrNeg = findViewById(R.id.nrNeg);
        final LinearLayout Triunghi = findViewById(R.id.triunghi);
        final LinearLayout Ecuatii = findViewById(R.id.ecuatii);
        final LinearLayout Cercul = findViewById(R.id.cercul);

        final Button startbtn = findViewById(R.id.start);


        nrNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Numere negative";
                nrNeg.setBackgroundResource(R.drawable.round_back_white_stroke);
                Triunghi.setBackgroundResource(R.drawable.round_back_white_stroke);
                Ecuatii.setBackgroundResource(R.drawable.round_back_white_stroke);
                Cercul.setBackgroundResource(R.drawable.round_back_white_stroke);


                // Deschide activitatea Clasa5
                Intent intent = new Intent(StudioAc6.this, PDFNUMNEG.class);
                startActivity(intent);
            }
        });


        Triunghi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Triunghi";
                nrNeg.setBackgroundResource(R.drawable.round_back_white_stroke);
                Triunghi.setBackgroundResource(R.drawable.round_back_white_stroke);
                Ecuatii.setBackgroundResource(R.drawable.round_back_white_stroke);
                Cercul.setBackgroundResource(R.drawable.round_back_white_stroke);



            }
        });

        Ecuatii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Ecuatii";
                nrNeg.setBackgroundResource(R.drawable.round_back_white_stroke);
                Triunghi.setBackgroundResource(R.drawable.round_back_white_stroke);
                Ecuatii.setBackgroundResource(R.drawable.round_back_white_stroke);
                Cercul.setBackgroundResource(R.drawable.round_back_white_stroke);



            }
        });

        Cercul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Cercul";
                nrNeg.setBackgroundResource(R.drawable.round_back_white_stroke);
                Triunghi.setBackgroundResource(R.drawable.round_back_white_stroke);
                Ecuatii.setBackgroundResource(R.drawable.round_back_white_stroke);
                Cercul.setBackgroundResource(R.drawable.round_back_white_stroke);



            }
        });
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(StudioAc6.this, "Vă rugăm să selectați un domeniu", Toast.LENGTH_SHORT).show();
                } else {
                    // Deschide activitatea corespunzătoare domeniului selectat
                    if (selectedTopicName.equals("Triunghi")) {
                        // Deschide activitatea Clasa6
                        Intent intent = new Intent(StudioAc6.this, PDFTRIUNGHI6.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Ecuatii")) {
                        // Deschide activitatea Clasa7
                        Intent intent = new Intent(StudioAc6.this, PDFECUATII.class);
                        startActivity(intent);
                    } else if (selectedTopicName.equals("Cercul")) {
                        Intent intent = new Intent(StudioAc6.this, PDFCERC.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}