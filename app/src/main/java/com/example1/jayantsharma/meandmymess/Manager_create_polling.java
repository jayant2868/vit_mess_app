package com.example1.jayantsharma.meandmymess;
import java.lang.String;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Manager_create_polling extends AppCompatActivity {
    public Button btn1, btn2;
    public EditText e1, e2, e3, e4, e5;

    DatabaseReference databaseComplaints;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_manager_create_polling);
        getSupportActionBar().setTitle("Create Poll");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        databaseComplaints = FirebaseDatabase.getInstance().getReference("Polling");
        btn1 = (Button) findViewById(R.id.button10);
        btn2 = (Button) findViewById(R.id.button13);
        e1 = (EditText) findViewById(R.id.efood1);
        e2 = (EditText) findViewById(R.id.efood2);
        e3 = (EditText) findViewById(R.id.efood3);
        e4 = (EditText) findViewById(R.id.efood4);
        e5 = (EditText) findViewById(R.id.mainfood);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addpol();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void addpol()
    {
        String s1, s2, s3, s4, s5;

        s1 = e1.getText().toString().trim();
        s2 = e2.getText().toString().trim();
        s3 = e3.getText().toString().trim();
        s4 = e3.getText().toString().trim();
        s5 = e5.getText().toString().trim();
    String id = databaseComplaints.push().getKey();
                if(!TextUtils.isEmpty(s1))

    {
        Pollingclass comp = new Pollingclass(id, s1, s2, s3, s4, s5);
        databaseComplaints.child(id).setValue(comp);
        Toast.makeText(Manager_create_polling.this, "Polling Added", Toast.LENGTH_LONG).show();
    }
                else

    {
        Toast.makeText(Manager_create_polling.this, "Fill All the Details", Toast.LENGTH_LONG).show();

    }

}
}
