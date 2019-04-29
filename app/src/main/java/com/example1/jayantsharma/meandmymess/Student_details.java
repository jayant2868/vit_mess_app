package com.example1.jayantsharma.meandmymess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Student_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        getSupportActionBar().setTitle("Student Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
