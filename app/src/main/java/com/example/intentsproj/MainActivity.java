package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Number1;
    EditText Number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1 = findViewById(R.id.Number1);
        Number2 = findViewById(R.id.Number2);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("N1",Number1.getText().toString());
                i.putExtra("N2", Number2.getText().toString());
                startActivity(i);
            }
        });
        Context context = getApplicationContext();
        CharSequence message = "you just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context , message , duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
    }
}