package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity16 extends AppCompatActivity {
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        tv=(TextView) findViewById(R.id.textView3);
        tv1=(TextView) findViewById(R.id.tv5);
        tv2=(TextView) findViewById(R.id.tv7);
        tv3=(TextView) findViewById(R.id.tv9);
        MainActivity15 activity = new MainActivity15();

//        Intent intent=new Intent();
        if(MainActivity15.intent.getExtras().containsKey("Score"))
        {        tv.setText(MainActivity15.intent.getStringExtra("Score"));
        }
        if(MainActivity15.intent.getExtras().containsKey("Correct"))
        {        tv1.setText(MainActivity15.intent.getStringExtra("Correct"));
        }
        if(MainActivity15.intent.getExtras().containsKey("Incorrect"))
        {        tv2.setText(MainActivity15.intent.getStringExtra("Incorrect"));
        }
        if(MainActivity15.intent.getExtras().containsKey("Count"))
        {        tv3.setText(MainActivity15.intent.getStringExtra("Count"));
        }
//        if(activity.intent.getExtras().containsKey("Correct"))
//        {        tv.setText(activity.intent.getStringExtra("Correct"));
//        }
//        if(activity.intent.getExtras().containsKey("Incorrect"))
//        {        tv.setText(activity.intent.getStringExtra("Incorrect"));
//        }
//        if(activity.intent.getExtras().containsKey("Count"))
//        {        tv.setText(activity.intent.getStringExtra("count"));
//        }

    }

}
