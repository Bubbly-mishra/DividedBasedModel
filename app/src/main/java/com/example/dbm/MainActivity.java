package com.example.dbm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText first;
    private EditText second;
    private EditText third;
    private EditText fourth;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.fst);
        second = (EditText) findViewById(R.id.scnd);
        third = (EditText) findViewById(R.id.thrd);
        fourth = (EditText) findViewById(R.id.frth);
        calculate = (Button) findViewById(R.id.calculate);


        calculate.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                double num1 = Double.parseDouble(first.getText().toString());
                double num2 = Double.parseDouble(second.getText().toString());
                double num3 = Double.parseDouble(third.getText().toString());

                double ke = (num3 / 100);

                double ti = (1 + ke);
                double pi = (num1 + num2);

                double si = pi / ti ;


                fourth.setText(Double.toString(si));
            }
        });
    }

}