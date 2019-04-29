package com.example1.jayantsharma.meandmymess;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Student_start_polling extends AppCompatActivity {
    public TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
    int a=1,b=0,c=0,d=0;

    FirebaseDatabase database;
    DatabaseReference ref;
    Pollingclass poll;

    public Button b1;
    RadioButton radioButton;
    RadioGroup radioGroup;
    int sum,p1,p2,p3,p4,p5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_student_start_polling);
        getSupportActionBar().setTitle("Polling");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tv5=findViewById(R.id.textView16);
        tv6=findViewById(R.id.textView19);
        tv7=findViewById(R.id.textView20);
        tv8=findViewById(R.id.textView21);
        tv9=findViewById(R.id.textView22);

        radioGroup = findViewById(R.id.radioGroup);
        b1=findViewById(R.id.button11);
        final RadioButton r1= findViewById(R.id.radioButton6);
       final  RadioButton r2= findViewById(R.id.radioButton5);
       final RadioButton r3= findViewById(R.id.radioButton3);
        final RadioButton r4= findViewById(R.id.radioButton4);


         poll = new Pollingclass();

        database = FirebaseDatabase.getInstance();
        ref= database.getReference("Polling");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds: dataSnapshot.getChildren())
                {
                    poll=ds.getValue(Pollingclass.class);
                    String s1=poll.getFood1();
                    r1.setText(s1);
                    String s2=poll.getFood2();
                    r2.setText(s2);
                    String s3=poll.getFood3();
                    r3.setText(s3);
                    String s4=poll.getFood4();
                    r4.setText("None of these");
                    String s5=poll.getFood5();
                    tv5.setText(s5);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                sum = (a + b + c + d);
                p1 = a / sum;
                p2 = b / sum;
                p3 = c / sum;
                p4 = d / sum;

                tv6.setText(""+p1);
                tv7.setText(""+p2);
                tv8.setText(""+p3);
                tv9.setText(""+p4);

            }
        });

    }
    public void checkButton(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.radioButton6:
            if(checked)
                ++a;

            break;
            case R.id.radioButton5:
                if(checked)
                    b++;
                break;
            case R.id.radioButton3:
                if(checked)
                    c++;
                break;
            case R.id.radioButton4:
                if(checked)
                    d++;
                break;
        }
    }
}
