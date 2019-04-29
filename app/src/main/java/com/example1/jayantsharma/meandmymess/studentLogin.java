package com.example1.jayantsharma.meandmymess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class studentLogin extends AppCompatActivity {
    private Button button;
    private EditText password,editText;
    String name,studentname,messname,pass1;
    DatabaseAccess a= new DatabaseAccess();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        getSupportActionBar().setTitle("Student Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button = (Button) findViewById(R.id.button_login);
        editText = (EditText) findViewById(R.id.edittext_username);
        password = (EditText) findViewById(R.id.edittext_password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()) {

                    openActivity1();
                    finish();
                }
                else {
                    openDialog();
                    password.setText("");
                    editText.setText("");

                }
            }
        });
    }
    public void openActivity1()
    {
        Intent intent1 = new Intent(this,student_Activity.class);

        startActivity(intent1);
    }
    public void openDialog()
    {
        Ex2Dialog e = new Ex2Dialog();
        e.show(getSupportFragmentManager(),"Dialog");
    }
    public Boolean validate()
    {
        name=editText.getText().toString().trim();
        Boolean result = false;
        studentname=a.student_name(name);
        pass1=a.password(name);
        messname=a.mess_name(name);
        Intent i = new Intent(studentLogin.this,Student_my_mess.class);
        i.putExtra("Value1",studentname);
        i.putExtra("Value2",messname);
        String pass=password.getText().toString();

        if(name.isEmpty() && pass.isEmpty()) {
            Toast.makeText(this, "Please Enter All The Details", Toast.LENGTH_SHORT).show();
        }
        else if(pass.equals(pass1))
        {
            Toast.makeText(this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
            result = true;


        }
        return  result;
    }
}

