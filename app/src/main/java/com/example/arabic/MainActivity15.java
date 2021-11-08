package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity15 extends AppCompatActivity {
Button answer1,answer2,answer3,answer4;
TextView question;
static int score;
private Question ques=new Question();
String answer;
int qLen=ques.mquestions.length;

Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        answer1 = (Button) findViewById(R.id.option1);
        answer2 = (Button) findViewById(R.id.option2);
        answer3 = (Button) findViewById(R.id.option3);
        answer4 = (Button) findViewById(R.id.option4);
        question = (TextView) findViewById(R.id.question);
        r = new Random();
        updateQues(r.nextInt(qLen));
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if(answer1.getText()==answer)
            {
                score++;
               updateQues(r.nextInt(qLen));
            }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(answer2.getText()==answer)
                {
                    score++;
                    updateQues(r.nextInt(qLen));
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText()==answer)
                {
                    score++;
                    updateQues(r.nextInt(qLen));
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText()==answer)
                {
                    score++;
                    updateQues(r.nextInt(qLen));
                }

            }

        });
    }
        void updateQues(int num)
        {
            question.setText(ques.getQuestion(num));
            answer1.setText(ques.getChoice1(num));
            answer2.setText(ques.getChoice2(num));
            answer3.setText(ques.getChoice3(num));
            answer4.setText(ques.getChoice4(num));
            answer=ques.getCorrectAns(num);

        }

}