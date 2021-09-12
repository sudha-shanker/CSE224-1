package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class BasicExample extends AppCompatActivity {
    
    EditText et1;
    RadioGroup rg1;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2;
    Spinner sp;
    ListView lv;
    Button b1;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_example);
        
        et1=findViewById(R.id.etname);
        rg1=findViewById(R.id.rg);
        rb1=findViewById(R.id.rbmale);
        rb2=findViewById(R.id.rbfemale);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        sp=findViewById(R.id.sp);
        lv=findViewById(R.id.lv);
        b1=findViewById(R.id.submit);
        
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
               // Toast.makeText(BasicExample.this, et1.getText().toString(), Toast.LENGTH_SHORT).show();

                int id= rg1.getCheckedRadioButtonId();
                switch (id)
                {
                    case R.id.rbmale:
                        s = s + " " + rb1.getText().toString();
                        break;
                    case R.id.rbfemale:
                        s= s+ " " + rb2.getText().toString();

                }
                if(cb1.isChecked())
                    s= s+" "+cb1.getText().toString();
                if(cb2.isChecked())
                    s= s+" "+cb2.getText().toString();

                String s1 = String.valueOf(sp.getSelectedItem());
                        s = s + " " + s1;
                Toast.makeText(BasicExample.this, s , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
