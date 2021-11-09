package com.example.arabic;

public class Question {
    public String mquestions[]={
            "Which arabic letter produce sound from middle of throat ?",
            "Which arabic letter produce sound from outer part of both lips touch each other ?",
            " ? 'ک' From which region sound produced for",
            "Which arabic letter produce sound from Tongue touching the center of the mouth roof ?",
            "Which arabic letter produce sound from Tip of the tongue comes between the front top and bottom teeth ?",
            " ? 'أ ' From which region sound produced for",
            "Which arabic letter produce sound from Rounded tip of the tongue touching the base of the frontal 6 teeth ?",
            " ? 'ل' From which region sound produced for",
            "Which arabic letter produce sound from Outer part of both lips touch each other ?",
            " ? 'ت' From which region sound produced for"


    };

    private String choices[][]={

            {"ع","غ ","م","و"},
            {"و","ع","م","ص "},
            {"Base of Tongue which is near Uvula touching the mouth roof","One side of the tongue touching the molar teeth","Middle of throat","Portion of Tongue near its base touching the roof of mouth"},
            {"ض","ن,ض","ج ش ی ","ق"},
            {"ز","م ن","ف","ظ"},
            {"One side of the tongue touching the molar teeth","Start of the Throat","End of Throat","Portion of Tongue near its base touching the roof of mouth"},
            {"ز","م ن","ف","ص"},
            {"Rounded tip of the tongue touching the base of the frontal 8 teeth","One side of the tongue touching the molar teeth","Middle of throat","Portion of Tongue near its base touching the roof of mouth"},
            {"و","ز","م","ص "},
            {"One side of the tongue touching the molar teeth","Tip of the tongue touching the base of the front 2 teeth","Middle of throat","Portion of Tongue near its base touching the roof of mouth"}


    };
    private String correctAns[]={

            "ع",
            "م",
            "Portion of Tongue near its base touching the roof of mouth",
            "ج ش ی ",
            "ز",
            "End of Throat",
            "ن",
            "Rounded tip of the tongue touching the base of the frontal 8 teeth",
            "م",
            "Tip of the tongue touching the base of the front 2 teeth"
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
