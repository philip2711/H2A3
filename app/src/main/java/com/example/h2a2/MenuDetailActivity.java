package com.example.h2a2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuDetailActivity extends AppCompatActivity {

    private TextView dmenuTextView;
    private TextView dpriceTextView;
    private TextView ddescriptionTextView;
    private TextView aquantity;
    private int menuID;
    private int quantity = 0;
    double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detail);

        Intent intent = getIntent();

        menuID = intent.getIntExtra("MenuID", 0);

        Menu menu = FakeDatabase.getMenuByID(menuID);

        dmenuTextView = findViewById(R.id.detailmenuname);
        dpriceTextView = findViewById(R.id.detailprice);
        ddescriptionTextView = findViewById(R.id.detaildescription);
        aquantity = findViewById(R.id.quantityv);

        dmenuTextView.setText(menu.getFname());
        dpriceTextView.setText("$" + menu.getPrice());
        ddescriptionTextView.setText(menu.getDescription());

        Button add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity += 1;
                String quantityordered = Integer.toString(quantity);
                aquantity.setText(quantityordered);
            }
        });

        Button less = findViewById(R.id.less);
        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity -= 1;
                String quantityordered = Integer.toString(quantity);
                aquantity.setText(quantityordered);
            }
        });

        Button addButton = findViewById(R.id.addtocart);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                    intent1.putExtra("MenuID", menuID);
                    intent1.putExtra("MenuQuantity", quantity);
                    startActivity(intent1);
                }
        });
    }

}
