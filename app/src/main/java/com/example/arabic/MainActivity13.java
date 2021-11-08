package com.example.arabic;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {
Button c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        c=(Button)findViewById(R.id.button2);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity13.this,MainActivity12.class);
                Intent intent=new Intent(view.getContext(),MainActivity12.class);
                view.getContext().startActivity(intent);
               // Intent intent = new Intent(MainActivity13.this, MainActivity12.class);
                //startActivity(intent);
                //startActivity( new Intent(MainActivity13.this, MainActivity12.class));
            }
        });
    }
}