package com.example.h2a2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    private static ArrayList<Menu> orders = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MenuAdapter menuAdapter = new MenuAdapter();
        menuAdapter.setData(FakeDatabase.getAllMenus());
        recyclerView.setAdapter(menuAdapter);

        Intent intent1 = getIntent();
        int menuID = intent1.getIntExtra("MenuID", 0);
        if (menuID != 0) {
            Menu menuEntry = new Menu(menuID);
            int menuQuantity = intent1.getIntExtra("MenuQuantity", 0);
            menuEntry.setQuantity(menuQuantity);
            orders.add(menuEntry);
        }

        Button viewcart = findViewById(R.id.viewcart);
        viewcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Order.class);
                intent2.putExtra("orderst", orders);
                startActivity(intent2);
            }
        });

    }


}
