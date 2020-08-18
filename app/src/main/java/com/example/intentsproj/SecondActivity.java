package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button ADD;
    TextView textView3;
    int N1;
    int N2;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String num1 = intent.getStringExtra("N1");
        String num2 = intent.getStringExtra("N2");

        N2 = Integer.parseInt(num1);
        N2 = Integer.parseInt(num2);

        ADD =  findViewById(R.id.ADD);
        sum = N1 + N2 ;
    }
}