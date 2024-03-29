package com.example.h2a2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Order extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<Menu> orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_main);

        orders = (ArrayList<Menu>) getIntent().getSerializableExtra("orderst");

        recyclerView = findViewById(R.id.rvorder);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        OrderAdapter orderAdapter = new OrderAdapter();
        orderAdapter.setData(orders);
        recyclerView.setAdapter(orderAdapter);

        TextView totalText = findViewById(R.id.totalView);
        String totals = "Total: $" + String.valueOf(orderAdapter.getTotal());
        totalText.setText(totals);


    }

}
