package com.elifoksas.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text = findViewById(R.id.numberText1);
        number2Text = findViewById(R.id.numberText2);
        resultText = findViewById(R.id.resultText);
    }


    public void toplama(View view){

        if(number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){
            resultText.setText("enter number!");
        }
        else{
        int number1= Integer.parseInt(number1Text.getText().toString());
        int number2= Integer.parseInt(number2Text.getText().toString());
        int result= number1+number2;
        resultText.setText("Result: "+result);
        }
    }
    public void cikarma(View view){

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("enter number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }
    public void carpma(View view){

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("enter number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }
    }
    public void bolme(View view){

        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("enter number!");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;
            resultText.setText("Result: " + result);
        }
    }

}