package com.example1.jayantsharma.meandmymess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcomescreen extends AppCompatActivity {
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomescreen);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

    }
  public void openActivity1()
  {
      Intent intent1 = new Intent(this,studentLogin.class);
      startActivity(intent1);
      finish();
  }
    public void openActivity2()
    {
        Intent intent2 = new Intent(this,manager_login.class);
        startActivity(intent2);
        finish();
    }
}
