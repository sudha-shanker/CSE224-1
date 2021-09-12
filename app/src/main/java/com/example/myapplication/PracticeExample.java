package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PracticeExample extends AppCompatActivity {
    EditText t1, t2, t3;
    TextView tv1;
    Button b1, b2, b3, b4, b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_example);
        t1 = findViewById(R.id.et1);
        t2 = findViewById(R.id.et2);
        t3 = findViewById(R.id.et3);
        b1 = findViewById(R.id.but1);
        b2 = findViewById(R.id.but2);
        b3 = findViewById(R.id.but3);
        b4 = findViewById(R.id.but4);
        b5 = findViewById(R.id.but5);
        tv1 = findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = t1.getText().toString();
                String s2 = t2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = a + b;
                Toast.makeText(PracticeExample.this, "Addition is" + c, Toast.LENGTH_SHORT);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String s3 = t1.getText().toString();
                                      String s4 = t2.getText().toString();
                                      int c = Integer.parseInt(s3);
                                      int d = Integer.parseInt(s4);
                                      int e = c - d;
                                      Toast.makeText(PracticeExample.this, "Subtraction is" + e, Toast.LENGTH_SHORT);

                                  }

                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s5 = t1.getText().toString();
                String s6 = t2.getText().toString();
                int f = Integer.parseInt(s5);
                int g = Integer.parseInt(s6);
                int h = f * g;
                Toast.makeText(PracticeExample.this, "Multiplication is" + h, Toast.LENGTH_SHORT);

            }


        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s7 = t1.getText().toString();
                String s8 = t2.getText().toString();
                int i = Integer.parseInt(s7);
                int j = Integer.parseInt(s8);
                int k = i + j;
                Toast.makeText(PracticeExample.this, "Division is" + k, Toast.LENGTH_SHORT);


            }
        });
    }
}

