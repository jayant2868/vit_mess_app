package com.example1.jayantsharma.meandmymess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Student_Mess_Manager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__mess__manager);
        getSupportActionBar().setTitle("Mess Manager Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
