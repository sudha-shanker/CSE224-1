package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LinearLayoutEx extends AppCompatActivity {
    Button bu1,bu2,bu3,bu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_ex);

        bu1=findViewById(R.id.b1);
        bu2=findViewById(R.id.b2);
        bu3=findViewById(R.id.b3);
        bu4=findViewById(R.id.b4);

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LinearLayoutEx.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LinearLayoutEx.this, "TOASTEX", Toast.LENGTH_LONG).show();
            }
        });
    }
}
