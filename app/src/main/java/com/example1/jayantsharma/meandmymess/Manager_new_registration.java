package com.example1.jayantsharma.meandmymess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Manager_new_registration extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product> productList;
    int kd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_new_registration);
        getSupportActionBar().setTitle("New Student Details");
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
                        "VIVEK KUMAR",
                        "17BEM0025",
                        "P-213",
                        "SPECIAL",
                        R.drawable.student123));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new Product(
                        1,
                        "VIJYANT RAJ",
                        "17BCE0029",
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

