package com.hasanvajdi.bmi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    TextView weightInput;
    TextView heightInput;
    Button submit;
    AlertDialog.Builder alertbuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightInput  = (TextView) findViewById(R.id.weight);
        heightInput  = (TextView) findViewById(R.id.height);
        submit = (Button) findViewById(R.id.submit);


        alertbuilder = new AlertDialog.Builder(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightContent = weightInput.getText().toString();
                int weightInt = Integer.parseInt(weightContent);

                String heightContent = heightInput.getText().toString();
                double heightInt = Double.parseDouble(heightContent);

                double BMI = weightInt / (heightInt * heightInt);
                String BMIstr="";

                if(BMI < 18.5){
                    BMIstr="شما کمبود وزن دارد";
                    alertbuilder.setTitle("وضعیت خطرناک");
                } else if(BMI>18.5 && BMI <24.5){
                    BMIstr="وزن شما مناسب است";
                    alertbuilder.setTitle("وضعیت خوب");
                } else if(BMI>24.5 && BMI < 29.9){
                    BMIstr="شما اضافه وزن دارید";
                    alertbuilder.setTitle("وضعیت خطرناک");
                }else if(BMI>30 ){
                    BMIstr="شما چاق هستید";
                    alertbuilder.setTitle("وضعیت خطرناک");
                }




                alertbuilder.setMessage(BMIstr.toString());
                alertbuilder.setPositiveButton("متوجه شدم", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alertbuilder.create();
                alertbuilder.show();
            }
        });
    }
}