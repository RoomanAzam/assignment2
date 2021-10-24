package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Button add_button;
    Button sub_button;
    Button mul_button;
    Button div_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText) findViewById(R.id.editTextNumber4);
        number2=(EditText) findViewById(R.id.editTextNumber5);
        add_button=(Button) findViewById((R.id.button3));
        sub_button=(Button) findViewById((R.id.button4));
        mul_button=(Button) findViewById(R.id.button5);
        div_button=(Button) findViewById(R.id.button6);
        result=(EditText) findViewById(R.id.editTextNumber6);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 =Double.parseDouble(number1.getText().toString());
                double num2 =Double.parseDouble(number2.getText().toString());
                double sum = num1+num2;
                result.setText(Double.toString(sum));
            }
        });
        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 =Double.parseDouble(number1.getText().toString());
                double num2 =Double.parseDouble(number2.getText().toString());
                double diff = num1-num2;
                result.setText(Double.toString(diff));
            }
        });
        mul_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 =Double.parseDouble(number1.getText().toString());
                double num2 =Double.parseDouble(number2.getText().toString());
                double mul = num1*num2;
                result.setText(Double.toString(mul));
            }
        });
        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 =Double.parseDouble(number1.getText().toString());
                double num2 =Double.parseDouble(number2.getText().toString());
                double div = num1/num2;

                result.setText(Double.toString(div));
            }
        });
    }
}