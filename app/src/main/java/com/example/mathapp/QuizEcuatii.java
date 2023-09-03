package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizEcuatii extends AppCompatActivity {

    private TextView questionTextView;
    private RadioGroup answersRadioGroup;

    private int score;
    private TextView scoreTextView;
    private Button submitButton;

    private List<QuizItem> quizItems;
    private int currentQuestionIndex;

    private void updateScore() {
        scoreTextView.setText("Scor: " + score);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_ecuatii);

        // Inițializați întrebările și răspunsurile
        initializeQuizItems();

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizEcuatii.this, MainActivity.class);
                startActivity(intent);
                finish(); // Terminați activitatea curentă pentru a reveni la MainActivity
            }
        });

        // Inițializați elementele vizuale
        questionTextView = findViewById(R.id.questionTextView);
        answersRadioGroup = findViewById(R.id.answersRadioGroup);
        submitButton = findViewById(R.id.submitButton);

        // Amestecați întrebările înainte de a le afișa
        Collections.shuffle(quizItems);

        // Setați întrebarea curentă
        setQuestion(currentQuestionIndex);

        scoreTextView = findViewById(R.id.scoreTextView);
        updateScore(); // Inițializați scorul afișat la 0

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });
    }

    private void initializeQuizItems() {
        quizItems = new ArrayList<>();

        // Adăugați celelalte întrebări și răspunsurile aici
        String question1 = "Care este rezultatul 2x - 4 = 0?";
        String[] answers1 = {"3", "2", "5", "7"};
        int correctAnswerIndex1 = 1;
        quizItems.add(new QuizItem(question1, answers1, correctAnswerIndex1));

        String question2 = "Care este rezultatul 5x + 4 = 9?";
        String[] answers2 = {"1", "2", "6", "4"};
        int correctAnswerIndex2 = 0;
        quizItems.add(new QuizItem(question2, answers2, correctAnswerIndex2));

        String question3 = "Care este rezultatul 3 + 5x = 10?";
        String[] answers3 = {"7/5", "5/7", "10/3", "5/10"};
        int correctAnswerIndex3 = 0;
        quizItems.add(new QuizItem(question3, answers3, correctAnswerIndex3));

        String question4 = "2x + 3x = 15?";
        String[] answers4 = {"4", "3", "2", "7"};
        int correctAnswerIndex4 = 1;
        quizItems.add(new QuizItem(question4, answers4, correctAnswerIndex4));

        String question5 = "15x - 10x = 5";
        String[] answers5 = {"1", "2", "6", "3"};
        int correctAnswerIndex5 = 0;
        quizItems.add(new QuizItem(question5, answers5, correctAnswerIndex5));

        String question6 = "6x + 4x = 50";
        String[] answers6 = {"1", "6", "5", "2"};
        int correctAnswerIndex6 = 2;
        quizItems.add(new QuizItem(question6, answers6, correctAnswerIndex6));

        String question7 = "90 - 10x = 0";
        String[] answers7 = {"9", "2", "5", "6"};
        int correctAnswerIndex7 = 0;
        quizItems.add(new QuizItem(question7, answers7, correctAnswerIndex7));

        String question8 = "5x + 6x = 66";
        String[] answers8 = {"6", "4", "3", "5"};
        int correctAnswerIndex8 = 0;
        quizItems.add(new QuizItem(question8, answers8, correctAnswerIndex8));

        // Amestecați întrebările înainte de a le afișa
        Collections.shuffle(quizItems);

        // Selectați primele 4 întrebări
        quizItems = quizItems.subList(0, 4);
    }

    private void setQuestion(int questionIndex) {
        QuizItem quizItem = quizItems.get(questionIndex);
        questionTextView.setText(quizItem.getQuestion());

        // Clear previous radio button selections
        answersRadioGroup.clearCheck();
        answersRadioGroup.removeAllViews();

        String[] answers = quizItem.getAnswers();
        for (int i = 0; i < answers.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(answers[i]);
            radioButton.setId(i);
            answersRadioGroup.addView(radioButton);
        }
    }

    private void checkAnswer() {
        int selectedAnswerIndex = answersRadioGroup.getCheckedRadioButtonId();

        if (selectedAnswerIndex == -1) {
            Toast.makeText(this, "Vă rugăm să selectați un răspuns", Toast.LENGTH_SHORT).show();
        } else {
            QuizItem quizItem = quizItems.get(currentQuestionIndex);

            if (quizItem.getCorrectAnswerIndex() == selectedAnswerIndex) {
                Toast.makeText(this, "Răspuns corect!", Toast.LENGTH_SHORT).show();
                score++; // Creșteți scorul cu 1 pentru un răspuns corect
            } else {
                Toast.makeText(this, "Răspuns greșit!", Toast.LENGTH_SHORT).show();
            }

            updateScore(); // Actualizați textul scorului afișat

            // Proceed to the next question or finish the quiz if all questions are answered
            currentQuestionIndex++;

            if (currentQuestionIndex < quizItems.size()) {
                setQuestion(currentQuestionIndex);
            } else {
                // All questions have been answered, show score and navigate to ScoreActivity

                if (score < 2) {
                    // Scor mai mic de 2, afișați un mesaj și permiteți repetarea testului
                    Toast.makeText(this, "Poti repeta testul după ce repeti", Toast.LENGTH_SHORT).show();
                } else if (score == 4) {
                    // Scor de 4, afișați un mesaj de felicitare
                    Toast.makeText(this, "Felicitări! Ai obținut scorul maxim!", Toast.LENGTH_SHORT).show();
                }

                // Crearea unui intent pentru a naviga către ScoreActivity
                Intent intent = new Intent(QuizEcuatii.this, ScoreActivity.class);
                intent.putExtra("score", score); // Transmiterea scorului către ScoreActivity
                startActivity(intent);
            }
        }
    }
}