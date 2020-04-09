package com.example.dbm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class M3 extends AppCompatActivity {
    private EditText first;
    private EditText third;
    private EditText fourth;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (EditText) findViewById(R.id.fst);
        third = (EditText) findViewById(R.id.thrd);
        fourth = (EditText) findViewById(R.id.frth);
        calculate = (Button) findViewById(R.id.calculate);


        calculate.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                double num1 = Double.parseDouble(first.getText().toString());
                double num3 = Double.parseDouble(third.getText().toString());

                double ke = (num3 / 100);

                double a = (num1 / ke);



                fourth.setText(String.format("%.2f", a));
            }
        });
    }

}
