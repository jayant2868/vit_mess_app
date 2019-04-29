package com.example1.jayantsharma.meandmymess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Manager_today_menu extends AppCompatActivity implements  View.OnClickListener {
    Button button5;
    Spinner dropdownmenu;
    String itemvalue;
    TextView Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_today_menu);
        getSupportActionBar().setTitle("Todays Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button5 = (Button) findViewById(R.id.button3);
        Menu = (TextView) findViewById(R.id.textView11);

        dropdownmenu = (Spinner) findViewById(R.id.spinner2);

        List<String> list = new ArrayList<>();
        list.add("MONDAY");
        list.add("TUESDAY");
        list.add("WEDNESDAY");
        list.add("THURSDAY");
        list.add("FRIDAY");
        list.add("SATURDAY");
        list.add("SUNDAY");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdownmenu.setAdapter(adapter);

        dropdownmenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemvalue = parent.getItemAtPosition(position).toString();
                Toast.makeText(Manager_today_menu.this, "Selected " + itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    TodaysMenu a = new TodaysMenu();

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                String breakfast = a.getbreakfast(itemvalue);
                String lunch=a.getlunch(itemvalue);
                String snacks=a.getsnacks(itemvalue);
                String dinner=a.getdinner(itemvalue);

                if (breakfast.equals("Not found")) {
                    Menu.setText("");
                    Menu.setText("BREAKFAST");
                } else {
                    Menu.setText(breakfast);
                }
                break;

        }
    }
}