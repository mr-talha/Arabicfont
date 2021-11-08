package com.example.arabic;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity14 extends AppCompatActivity {
Button b1;
Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        b1=(Button)findViewById(R.id.prac);
        b2=(Button)findViewById(R.id.exam);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity14.this, MainActivity2.class);
//                startActivity(intent);
                Intent intent=new Intent(view.getContext(),MainActivity2.class);
                view.getContext().startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity14.this, MainActivity15.class);
//                startActivity(intent);
                Intent intent=new Intent(view.getContext(),MainActivity15.class);
                view.getContext().startActivity(intent);

            }
        });
    }
}