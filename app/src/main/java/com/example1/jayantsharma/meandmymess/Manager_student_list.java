package com.example1.jayantsharma.meandmymess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager_student_list extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product> productList;
    int kd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_student_list);
        getSupportActionBar().setTitle("Registered Student List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        productList = new ArrayList<>();

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        EditText editText = findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                filter(s.toString());
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "JAYANT BABU",
                        "17BCE0382",
                        "F-213",
                        "VEG",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "KUNWAR TANEJA",
                        "17BCE0990",
                        "B-232",
                        "SPECIAL",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "ANANT RAJ",
                        "17BCE2178",
                        "H-338",
                        "VEG",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "HARSH KUMAR",
                        "17BCE0056",
                        "l-351",
                        "PAID",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "MUKUND MISRA",
                        "17BME0134",
                        "D-521",
                        "SPECIAL",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        " PRATEEK RAJ",
                        "17BIT0301",
                        "F-452",
                        "NON VEG",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "KUMAR VAIBHAV",
                        "17BCE0004",
                        "K-231",
                        "PAID",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "ANMOL SINGH",
                        "17BCE0005",
                        "P-213",
                        "SPECIAL",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "HARSH RAJ",
                        "17BCE0006",
                        "P-513",
                        "NON VEG",
                        R.drawable.student123));

        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);

        }
   private void filter(String text)
   {
       ArrayList<Product> filteredList = new ArrayList<>();

       for(Product item : productList)
       {
           if(item.getRegno().toLowerCase().contains(text.toLowerCase()))
           {
               filteredList.add(item);
           }
       }
       adapter.filterlist(filteredList);
   }


}


