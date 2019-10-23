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

        final Menu menuAtPosition = orders.get(position);

        holder.ordername.setText(menuAtPosition.getFname());
        String itemMenuOrderQuantityString = Integer.toString(menuAtPosition.getQuantity());
        holder.orderquantity.setText(itemMenuOrderQuantityString);

    }

    public int getItemCount() {
        return orders.size();
    }



    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView ordername;
        public TextView orderquantity;

        public OrderViewHolder(View v) {
            super(v);
            view = v;
            ordername = v.findViewById(R.id.ordernamedisplay);
            orderquantity = v.findViewById(R.id.orderquantitydisplay);
        }
    }
}
