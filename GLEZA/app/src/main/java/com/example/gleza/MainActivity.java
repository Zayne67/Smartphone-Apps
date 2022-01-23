package com.example.gleza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_GLEZA);
        setContentView(R.layout.activity_main);

        configureLogin();
}
private void configureLogin(){
        TextView name;
        EditText Inputname;

        Inputname = (EditText) findViewById(R.id.NameInput);
        name = (TextView) findViewById(R.id.NameText);
        Button Btn1 = (Button) findViewById(R.id.Login);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}