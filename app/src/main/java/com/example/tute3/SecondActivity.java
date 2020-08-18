package com.example.tute3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1;
    TextView num2;
    TextView result;
    Button plus,minus,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);


        Bundle extras = getIntent().getExtras();
        String num1 = extras.getString("num1");
        int num11 = Integer.parseInt(num1);
        String num2 = extras.getString("num2");
        int num2 = Integer.parseInt(num2);

        num1.setText(num1);
        num2.setText(num2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(num1+" + "+num2+" = "+(num1+num2));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(num1+" - "+num2+" = "+(num1-num2));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(num1+" * "+num2+" = "+(num1*num2));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(num1+" / "+num2+" = "+(num1/num2));
            }
        });



    }
}