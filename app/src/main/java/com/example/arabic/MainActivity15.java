package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity15 extends AppCompatActivity {
Button answer1,answer2,answer3,answer4;
TextView question;
static int score;
static int total=1;
Button finish;
static int correct;
  static  Intent intent;
static int incorrect;

private Question ques=new Question();
String answer;
int qLen=ques.mquestions.length;
Button next;

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
        finish=(Button)findViewById(R.id.fn) ;
        next=(Button)findViewById(R.id.nxt);
        r = new Random();
        updateQues(r.nextInt(qLen));
        int greenColor= Color.GREEN;
        int redColor= Color.RED;
        int blueColor= Color.BLUE;

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            if(answer1.getText()==answer)
            {
                score++;
                correct++;
               answer1.setBackgroundColor(greenColor);
            }
            else
            {
                answer1.setBackgroundColor(redColor);
                incorrect++;
                if(answer2.getText()==answer)
                {
                    answer2.setBackgroundColor(greenColor);
                }
                else if(answer3.getText()==answer)
                {
                    answer3.setBackgroundColor(greenColor);
                }
                else if(answer4.getText()==answer)
                {
                    answer4.setBackgroundColor(greenColor);
                }
            }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {



                updateQues(r.nextInt(qLen));
                total++;
                answer1.setBackgroundColor(blueColor);
                answer2.setBackgroundColor(blueColor);
                answer3.setBackgroundColor(blueColor);
                answer4.setBackgroundColor(blueColor);






            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent
                intent=new Intent(view.getContext(),MainActivity16.class);

                //String d=e1.getText().toString();
                // send data

                intent.putExtra("Score",String.valueOf(score));
                intent.putExtra("Correct",String.valueOf(correct));
                intent.putExtra("Incorrect",String.valueOf(incorrect));
                intent.putExtra("Count",String.valueOf(total));
                // start intent
                view.getContext().startActivity(intent);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(answer2.getText()==answer)
                {
                    score++;
                    correct++;
                    answer2.setBackgroundColor(greenColor);
                }
                else
                {
                    answer2.setBackgroundColor(redColor);
                    incorrect++;
                    if(answer1.getText()==answer)
                    {
                        answer1.setBackgroundColor(greenColor);
                    }
                    else if(answer3.getText()==answer)
                    {
                        answer3.setBackgroundColor(greenColor);
                    }
                    else if(answer4.getText()==answer)
                    {
                        answer4.setBackgroundColor(greenColor);
                    }
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(answer3.getText()==answer)
                {
                    score++;
                    correct++;
                    answer3.setBackgroundColor(greenColor);
                }
                else
                {
                    answer3.setBackgroundColor(redColor);
                    incorrect++;
                    if(answer1.getText()==answer)
                    {
                        answer1.setBackgroundColor(greenColor);
                    }
                    else if(answer2.getText()==answer)
                    {
                        answer2.setBackgroundColor(greenColor);
                    }
                    else if(answer4.getText()==answer)
                    {
                        answer4.setBackgroundColor(greenColor);
                    }
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(answer4.getText()==answer)
                {
                    score++;
                    correct++;
                    answer4.setBackgroundColor(greenColor);
                }
                else
                {
                    answer4.setBackgroundColor(redColor);
                    incorrect++;
                    if(answer1.getText()==answer)
                    {
                        answer1.setBackgroundColor(greenColor);
                    }
                    else if(answer3.getText()==answer)
                    {
                        answer3.setBackgroundColor(greenColor);
                    }
                    else if(answer2.getText()==answer)
                    {
                        answer2.setBackgroundColor(greenColor);
                    }
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