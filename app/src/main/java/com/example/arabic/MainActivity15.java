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
static int correct;
static int incorrect;
  static  int d=0;
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


                if(d>(qLen))
                {
                    Intent intent=new Intent(view.getContext(),MainActivity2.class);
                    view.getContext().startActivity(intent);
                    // d++;
                }
                d++;
                updateQues(r.nextInt(qLen));
                total++;
                answer1.setBackgroundColor(blueColor);
                answer2.setBackgroundColor(blueColor);
                answer3.setBackgroundColor(blueColor);
                answer4.setBackgroundColor(blueColor);
//                d++;
//                if(d>=qLen)
//                {
//                    Intent intent=new Intent(view.getContext(),MainActivity2.class);
//                    view.getContext().startActivity(intent);
//                   // d++;
//                }






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