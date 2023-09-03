package com.example.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CL6Activity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cl6);

        final LinearLayout studiu = findViewById(R.id.studiu);
        final LinearLayout teste = findViewById(R.id.teste);




        studiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Studiu";
                studiu.setBackgroundResource(R.drawable.round_back_white_stroke);
                teste.setBackgroundResource(R.drawable.round_back_white_stroke);

                // Deschide activitatea Clasa5
                Intent intent = new Intent(CL6Activity.this, StudioAc6.class);
                startActivity(intent);
            }
        });


        teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Teste";
                studiu.setBackgroundResource(R.drawable.round_back_white_stroke);
                teste.setBackgroundResource(R.drawable.round_back_white_stroke);

                Intent intent = new Intent(CL6Activity.this, TesteAc6.class);
                startActivity(intent);

            }

        });
    }
};