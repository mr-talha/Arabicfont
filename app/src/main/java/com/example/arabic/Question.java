package com.example.arabic;

public class Question {
    public String mquestions[]={
            "Which arabic letter produce sound from middle of throat ?",
            "Which arabic letter produce sound from outer part of both lips touch each other ?"
    };

    private String choices[][]={

            {"ع","غ ","م","و"},{"و","ع","م","ص "}
    };
    private String correctAns[]={

            "ع","م"
    };
    public String getQuestion(int a)
    {
        String ques=mquestions[a];
        return ques;
    }
    public String getChoice2(int a)
    {
        String c2=choices[a][1];
        return c2;
    }
    public String getChoice3(int a)
    {
        String c3=choices[a][2];
        return c3;
    }
    public String getChoice4(int a)
    {
        String c4=choices[a][3];
        return c4;
    }
    public String getChoice1(int a)
    {
        String c1=choices[a][0];
        return c1;
    }
    public String getCorrectAns(int a)
    {
        String ans=correctAns[a];
        return ans;
    }

}
