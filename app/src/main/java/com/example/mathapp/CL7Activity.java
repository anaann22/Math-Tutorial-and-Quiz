package com.example.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CL7Activity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cl7);

        final LinearLayout studiu = findViewById(R.id.studiu);
        final LinearLayout teste = findViewById(R.id.teste);




        studiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Studiu";
                studiu.setBackgroundResource(R.drawable.round_back_white_stroke);
                teste.setBackgroundResource(R.drawable.round_back_white_stroke);

                // Deschide activitatea Clasa5
                Intent intent = new Intent(CL7Activity.this, StudioAc7.class);
                startActivity(intent);
            }
        });


        teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Teste";
                studiu.setBackgroundResource(R.drawable.round_back_white_stroke);
                teste.setBackgroundResource(R.drawable.round_back_white_stroke);

                Intent intent = new Intent(CL7Activity.this, TesteAc7.class);
                startActivity(intent);

            }

        });
    }
};