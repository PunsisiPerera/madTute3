package com.example.tute3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    Button btnok;
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnok = findViewById(R.id.btnok);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);

                Bundle extras = new Bundle();
                extras.putString("num1",num1);
                extras.putString("num2",num2);
                i.putExtras(extras);
                startActivity(i);


                Context context = getApplicationContext(); //The context to
                //use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button";
//Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast
                //message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
            }
        });

    }
}
