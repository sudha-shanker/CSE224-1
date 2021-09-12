package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerExampleDay extends AppCompatActivity {

    Spinner spin1,spin2,spin3;
    TextView tvspin;
    Button bu1;
    String months[] =
            {
                    "January" , "February" , "March" , "April", "May",
                    "June", "July", "August", "September", "October",
                    "November", "December"
            };
    String days[]={"1","2","3","4","5","6"};
    String years[]={"2000","2001","2002","2003"};
    String SelDate,Selyear,Selmonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_example_day);
        spin1 = findViewById(R.id.spin1);
        spin2 = findViewById(R.id.spin2);
        spin3 = findViewById(R.id.spin3);
        tvspin=findViewById(R.id.tvspin);
        bu1=findViewById(R.id.bu1);
        ArrayAdapter<String> months1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, months);
        ArrayAdapter<String> days1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, days);
        ArrayAdapter<String> years1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, years);
        spin1.setAdapter(days1);
        spin2.setAdapter(months1);
        spin3.setAdapter(years1);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelDate = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Selmonth = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Selyear = parent.getItemAtPosition(position).toString();
             //   Toast.makeText(SpinnerExampleDay.this, "Selected Date: "+SelDate+" "+Selmonth+" "+Selyear+" ", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvspin.setText("Selected Date: "+SelDate+" "+Selmonth+" "+Selyear+" ");
            }
        });
    }
}
