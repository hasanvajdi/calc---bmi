package com.hasanvajdi.cacl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button plus;
    Button minuse;
    Button product;
    Button division;

    TextView firstNumber;
    TextView secondNumber;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus  = (Button) findViewById(R.id.plus);
        minuse = (Button) findViewById(R.id.minuse);
        product = (Button) findViewById(R.id.product);
        division = (Button) findViewById(R.id.division);

        firstNumber = (TextView) findViewById(R.id.firstNumber);
        secondNumber = (TextView) findViewById(R.id.secondNumber);
        result = (TextView) findViewById(R.id.result);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstValue = firstNumber.getText().toString();
                String secondValue = secondNumber.getText().toString();

                int firstInt = Integer.parseInt(firstValue);
                int secondInt = Integer.parseInt(secondValue);

                int finalResult = firstInt + secondInt;

                String finalStringResult = Integer.toString(finalResult);

                result.setText(finalStringResult);
            }
        });

        minuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstValue = firstNumber.getText().toString();
                String secondValue = secondNumber.getText().toString();

                int firstInt = Integer.parseInt(firstValue);
                int secondInt = Integer.parseInt(secondValue);

                int finalResult = firstInt - secondInt;

                String finalStringResult = Integer.toString(finalResult);

                result.setText(finalStringResult);
            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstValue = firstNumber.getText().toString();
                String secondValue = secondNumber.getText().toString();

                int firstInt = Integer.parseInt(firstValue);
                int secondInt = Integer.parseInt(secondValue);

                int finalResult = firstInt * secondInt;

                String finalStringResult = Integer.toString(finalResult);

                result.setText(finalStringResult);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstValue = firstNumber.getText().toString();
                String secondValue = secondNumber.getText().toString();

                int firstInt = Integer.parseInt(firstValue);
                int secondInt = Integer.parseInt(secondValue);

                int finalResult = firstInt / secondInt;

                String finalStringResult = Integer.toString(finalResult);

                result.setText(finalStringResult);
            }
        });
    }
}