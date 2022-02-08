package com.example.myworkoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Exercise extends AppCompatActivity {
    Spinner MySpinner;
    TextView MyWorkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        MySpinner = (Spinner) findViewById(R.id.spinner);
        MyWorkout = (TextView) findViewById(R.id.textView11);
    }
    public void info(View view) {
        String Workout = String.valueOf(MySpinner.getSelectedItem());
        WorkoutType Expert=new WorkoutType();
        List<String> Description= Expert.getWorkouts(Workout);
        StringBuilder WorkoutFormatted=new StringBuilder();
        for(String work:Description) {
            WorkoutFormatted.append(work).append('\n');
        }
        MyWorkout.setText(WorkoutFormatted);
    }
}