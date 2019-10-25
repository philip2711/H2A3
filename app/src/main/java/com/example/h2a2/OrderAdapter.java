package com.example.h2a2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private ArrayList<Menu> orders;

    public void setData(ArrayList<Menu> orders) {
        this.orders = orders;
    }

    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.order, parent, false);
        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    public void onBindViewHolder(@NonNull final OrderViewHolder holder, final int position) {

        final Menu orderAtPosition = orders.get(position);

        holder.ordername.setText(orderAtPosition.getFname());
        holder.orderquantity.setText("x" + String.valueOf(orderAtPosition.getQuantity()));
        holder.orderprice.setText("$" + orderAtPosition.getPrice());
        String ordertotal = String.valueOf(orderAtPosition.getQuantity() * Integer.parseInt(orderAtPosition.getPrice()));
        holder.ordertotaldisplay.setText("Altogether: $" + ordertotal);

    }

    public int getItemCount() {
        return orders.size();
    }

    public static int total = 0;

    public int getTotal() {
        for (int i = 0; i < orders.size(); i++) {
            Menu order = orders.get(i);
            total += (order.getQuantity() * Integer.parseInt(order.getPrice()));
        }
        return total;
    }


    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView ordername;
        public TextView orderquantity;
        public TextView orderprice;
        public TextView ordertotaldisplay;

        public OrderViewHolder(View v) {
            super(v);
            view = v;
            ordername = v.findViewById(R.id.ordernamedisplay);
            orderquantity = v.findViewById(R.id.orderquantitydisplay);
            orderprice = v.findViewById(R.id.orderpriceview);
            ordertotaldisplay = v.findViewById(R.id.ordertotaldisplay);
        }
    }
}
