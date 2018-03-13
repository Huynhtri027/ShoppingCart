package com.vinitvs.shoppingcart.ui.customerList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vinitvs.shoppingcart.holder.CustomerListViewHolder;
import com.vinitvs.shoppingcart.R;
import com.vinitvs.shoppingcart.model.Customers;

import java.util.ArrayList;

/**
 * Created by Vinit on 3/3/2018.
 */

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListViewHolder> {
    ArrayList<Customers> customersArrayList;

    public CustomerListAdapter(ArrayList<Customers> customersArrayList) {
        this.customersArrayList = customersArrayList;
    }



    @Override
    public CustomerListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_customer, parent, false);
        return new CustomerListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomerListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
