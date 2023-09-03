package com.example.mathapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class PDFBAR2020 extends AppCompatActivity {

    PDFView pdfView;
    Button backButton;
    Button nextButton;
    int currentPage = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfbar2020);

        pdfView = findViewById(R.id.pdfView);
        backButton = findViewById(R.id.backButton);
        nextButton = findViewById(R.id.nextButton);

        pdfView.fromAsset("EN_matematica_2019_bar_model_LRO.pdf")
                .defaultPage(currentPage)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(10)
                .load();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PDFBAR2020.this, com.example.mathapp.MainActivity.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentPage < pdfView.getPageCount() - 1) {
                    currentPage++;
                    pdfView.jumpTo(currentPage);
                } else {
                    Intent intent = new Intent(PDFBAR2020.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}