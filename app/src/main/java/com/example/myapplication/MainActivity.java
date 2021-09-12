package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2, t3;
    TextView tv1;
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.et1);
        t2 = findViewById(R.id.et2);
        t3 = findViewById(R.id.et3);
        b1 = findViewById(R.id.but1);
        b2 = findViewById(R.id.but2);
        b3 = findViewById(R.id.but3);
        b4 = findViewById(R.id.but4);
        b5 = findViewById(R.id.but5);
        tv1= findViewById(R.id.tv1);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "ggggggggggggg", Toast.LENGTH_SHORT).show();

            }

        });
    }
    public void process(View v) {
        t1.setText("172.19.18.20");
        t2.setText("255.255.255.0");
        t3.setText("172.19.18.1");
       // t4.setText("android");

    }




}