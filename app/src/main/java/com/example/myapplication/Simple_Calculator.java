package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Simple_Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    TextView tv1;
    Button b1,b2,b3,b4;
    int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple__calculator);

        et1 = findViewById(R.id.inp1);
        et2 = findViewById(R.id.inp2);
        tv1 = findViewById(R.id.output);
        b1 = findViewById(R.id.add);
        b2 = findViewById(R.id.sub);
        b3 = findViewById(R.id.mul);
        b4 = findViewById(R.id.div);

        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String x = et1.getText().toString();
               String y = et2.getText().toString();

               if(x.equals("")||y.equals(""))
                   Toast.makeText(Simple_Calculator.this, "Enter Values", Toast.LENGTH_SHORT).show();
               else
               {
                   a = Integer.parseInt(x);
                   b = Integer.parseInt(y);
                   c=a+b;
                   tv1.setText(c+" ");

               }

           }
       });

    }

    @Override
    public void onClick(View v) {
        String x = et1.getText().toString();
        String y = et2.getText().toString();

        if(x.equals("")||y.equals(""))
            Toast.makeText(Simple_Calculator.this, "Enter Values", Toast.LENGTH_SHORT).show();
        else {
            a = Integer.parseInt(x);
            b = Integer.parseInt(y);
            switch (v.getId()) {
                case R.id.sub:
                    c = a - b;
                    tv1.setText(c + " ");
                    break;

                case R.id.mul:
                    c = a * b;
                    tv1.setText(c + " ");
                    break;

                case R.id.div:
                    c = a / b;
                    tv1.setText(c + " ");
                    break;
            }
        }
    }
}
