package com.example.gleza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        configurePastelHood();
        configurePastelShirt();
        configurePurpleCap();
    }
    private void configurePastelHood(){
        Button Btn1 = (Button) findViewById(R.id.PastelHood);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, Buy1.class));
            }
        });
    }
    private void configurePastelShirt(){
        Button Btn2 = (Button) findViewById(R.id.PastelShirt);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, Buy2.class));
            }
        });
    }
    private void configurePurpleCap(){
        Button Btn3 = (Button) findViewById(R.id.PurpleCap);
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, Buy3.class));
            }
        });
    }
}