package com.duhanaktan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2;
    TextView vieww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text=findViewById(R.id.firstNum);
        number2=findViewById(R.id.secondNum);
        vieww = findViewById(R.id.textView);
    }
    public void Sum(View view){
        if(number1Text.getText().toString().matches("") || number2.getText().toString().matches("")){
            vieww.setText("Enter Number!");
        }else{
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number= Integer.parseInt(number2.getText().toString());

        int result=number1+number;

        vieww.setText("Result: "+result);}
    }
    public void Minus(View view){
        if(number1Text.getText().toString().matches("") || number2.getText().toString().matches("")){
            vieww.setText("Enter Number!");
        }else{
            int number1= Integer.parseInt(number1Text.getText().toString());
            int number= Integer.parseInt(number2.getText().toString());

            int result=number1-number;

            vieww.setText("Result: "+result);}
    }
    public void Product(View view){
        if(number1Text.getText().toString().matches("") || number2.getText().toString().matches("")){
            vieww.setText("Enter Number!");
        }else{
            int number1= Integer.parseInt(number1Text.getText().toString());
            int number= Integer.parseInt(number2.getText().toString());

            int result=number1*number;

            vieww.setText("Result: "+result);}
    }
    public void Divide(View view) {
        if (number1Text.getText().toString().matches("") || number2.getText().toString().matches("")) {
            vieww.setText("Enter Number!");
        } else {
            if (number2.getText().toString().matches("0")) {
                vieww.setText("Invalid instruction!");
            }else{
                int number1 = Integer.parseInt(number1Text.getText().toString());
                int number = Integer.parseInt(number2.getText().toString());

                int result = number1 / number;

                vieww.setText("Result: " + result);
            }

        }
    }
}