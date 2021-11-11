package com.example.arabic;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b;
    Button nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.rl);
        nxt=(Button)findViewById(R.id.next);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUrl(view,"https://github.com/mr-talha/Arabicfont.git");
            }
        });
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),MainActivity14.class);
                view.getContext().startActivity(intent);

            }
        });

    }
    private void getUrl(View view,String s)
    {   //url of repo
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        view.getContext().startActivity(intent);

    }
}