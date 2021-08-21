package com.example.android.practicequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            textView= findViewById(R.id.textView);

            Button button=findViewById(R.id.option1);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("Correct Answer: Fitbit is an American consumer electronics and fitness company headquartered in San Francisco, California.");
                    button.setBackgroundColor( getResources().getColor(R.color.green));

                }
            });
              Button button2=findViewById(R.id.option2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("wrong Answer");
                //Toast.makeText(MainActivity2.this, "yes", Toast.LENGTH_SHORT).show();
               button2.setBackgroundColor( getResources().getColor(R.color.red));
//                SCORE=SCORE+1;
//                TextView textView=findViewById(R.id.score);
//                textView.setText(SCORE+"");



            }
        });
            Button button3=findViewById(R.id.option3);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("Wrong Answer");
                    button3.setBackgroundColor( getResources().getColor(R.color.red));

//                    MainActivity.SCORE=MainActivity.SCORE+1;
//                    TextView textView=findViewById(R.id.score);
//                    textView.setText(MainActivity.SCORE+"");



                }
            });
            Button button4=findViewById(R.id.option4);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("Wrong Answer");
                    button4.setBackgroundColor( getResources().getColor(R.color.red));

                }
            });
            Button next=findViewById(R.id.next2);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(MainActivity2.this, "yes", Toast.LENGTH_SHORT).show();
                   Intent intent =new Intent(MainActivity2.this,MainActivity3.class);
                   startActivity(intent);

                }
            });
    }
}