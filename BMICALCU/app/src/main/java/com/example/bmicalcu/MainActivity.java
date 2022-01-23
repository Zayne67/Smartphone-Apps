package com.example.bmicalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Result, BMIT;
    EditText Height, Weight;
    Button Output;

    double BMI;
    double Height_1, Weight_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_BMICALCU);
        setContentView(R.layout.activity_main);
        // Output Variables
        Result = (TextView) findViewById(R.id.Result);
        BMIT = (TextView) findViewById(R.id.BMI);
        // Input Variables
        Height = (EditText) findViewById(R.id.Height);
        Weight = (EditText) findViewById(R.id.Weight);
        // Clickable / Button
        Output = (Button) findViewById(R.id.button);
        // If "Output" Clicked
        Output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sets the Variables for Height_1, Weight_1
                Height_1 = Double.parseDouble(Height.getText().toString());
                Weight_1 = Double.parseDouble(Weight.getText().toString());
                // Total of BMI
                BMI = ((Weight_1 / Height_1) / Height_1) * 10000;
                // Output BMI
                BMIT.setText(String.valueOf(BMI));
                // If-Else Statement
                if (BMI < 18.5) {
                    Result.setText("Under Weight");
                } else if (BMI > 18.6 && BMI < 24.9) {
                    Result.setText(String.valueOf(" Normal Weight"));
                } else if (BMI > 25 && BMI < 29.9) {
                    Result.setText(String.valueOf("Over Weight"));
                } else if (BMI > 30 && BMI < 34.9) {
                    Result.setText(String.valueOf("Obesity Class I"));
                } else if (BMI > 35 && BMI < 39.9) {
                    Result.setText(String.valueOf("Obesity Class II"));
                } else if (BMI > 40 && BMI < 44.99) {
                    Result.setText(String.valueOf("Obesity Class III"));
                } else {
                    Result.setText(String.valueOf("JULES WEIGHT"));
                }
            }
        });
    }
}