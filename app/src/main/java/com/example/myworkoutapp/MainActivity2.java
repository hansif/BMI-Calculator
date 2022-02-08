package com.example.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText Name;
    private EditText Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name = (EditText) findViewById(R.id.editTextTextPersonName);
        Age = (EditText) findViewById(R.id.editTextTextPersonName2);
    }
    public void checkBMI(View view) {
        Intent a=new Intent(this,Main4Activity.class);
        startActivity(a);
    }
    public void checkHealth(View view) {
        Intent b=new Intent(this,HealthTip.class);
        startActivity(b);
    }
    public void doExercise(View view) {
        Intent c=new Intent(this,Exercise.class);
        startActivity(c);
    }

}