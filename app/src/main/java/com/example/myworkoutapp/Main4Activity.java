package com.example.myworkoutapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private EditText MyWeight;
    private EditText myHeight;
    private TextView myBMI;
    private TextView remark1;
    private float weight;
    private float height;
    private String Weight;
    private String Height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        MyWeight=(EditText) findViewById(R.id.editTextTextPersonName3);
        myHeight = (EditText) findViewById(R.id.editTextTextPersonName4);
        myBMI = (TextView) findViewById(R.id.textView8);
        remark1 = (TextView) findViewById(R.id.textView9);
    }
    public void findBMI(View view) {
        Weight=MyWeight.getText().toString();
        Height =myHeight.getText().toString();
        if(Weight!=null && !"".equals(Weight))
        weight=Float.parseFloat(Weight);
        if(Height!=null && !"".equals(Height))
        height = Float.parseFloat(Height)/100;
        float bmi = calculateBMI(weight, height);
        String mybmi=String.valueOf(bmi);
        myBMI.setText(mybmi);
        String remark=calculateString(bmi);
        remark1.setText(remark);
    }
    public float calculateBMI(float w,float h) {
        float BMI=(w)/(h*h);
        return BMI;
    }
    public String calculateString(float bmi) {
        String MyRemark;
        if(bmi<18.5)
            MyRemark="Under Weight";
        else if(bmi>=18.5 && bmi<25)
            MyRemark="Normal Weight(Healthy)";
        else if(bmi>=25 && bmi<30)
            MyRemark="Over Weight";
        else if(bmi>=30 && bmi<40)
            MyRemark="Obese Weight";
        else
            MyRemark="Not under any category";
        return MyRemark;
    }
}