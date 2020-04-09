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

                double g = (num2 / 100);
                double ke = (num3 / 100);

                double f = num1 * 1;
                double s = num1 * g;
                double ti =(f + s);
                double pi = (ke - g);
                double a = ti / pi ;


                fourth.setText(String.format("%.2f", a));
            }
        });
    }

}