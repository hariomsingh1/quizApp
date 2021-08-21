package com.example.android.practicequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    //  public static int SCORE=0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView= findViewById(R.id.textView);

        Button button=findViewById(R.id.option1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Wrong Answer");
                button.setBackgroundColor( getResources().getColor(R.color.red));

            }
        });
        Button button2=findViewById(R.id.option2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Wrong Answer");
                button2.setBackgroundColor( getResources().getColor(R.color.red));

            }
        });
        Button button3=findViewById(R.id.option3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Wrong Answer");
                button3.setBackgroundColor( getResources().getColor(R.color.red));
//                SCORE=SCORE+1;
//                TextView textView=findViewById(R.id.score);
//                textView.setText(SCORE+"");



            }
        });
        Button button4=findViewById(R.id.option4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Correct Answer: Dropbox is a file hosting service operated by the American company Dropbox, Inc., headquartered in San Francisco, California,");
                button4.setBackgroundColor( getResources().getColor(R.color.green));

            }
        });
        Button next=findViewById(R.id.next2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity3.this, "hi", Toast.LENGTH_SHORT).show();
                Intent i =new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);

            }
        });

    }
}