package com.vinitvs.shoppingcart.ui.customerList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.vinitvs.shoppingcart.core.ShoppingApplication;
import com.vinitvs.shoppingcart.holder.CustomerListViewHolder;
import com.vinitvs.shoppingcart.R;
import com.vinitvs.shoppingcart.model.Customer;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Vinit on 3/3/2018.
 */

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListViewHolder> {
    List<Customer> customerList;
    private Context mContext;
    public CustomerListAdapter(List<Customer> customerArrayList, Context mContext) {
        this.customerList = customerArrayList;
        this.mContext = mContext;
        ShoppingApplication.getInstance().getAppComponent().inject(this);
    }



    @Override
    public CustomerListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_customer, parent, false);
        return new CustomerListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomerListViewHolder holder, int position) {
        holder.customerName.setText(customerList.get(position).getCustomerName());
        holder.customerEmail.setText(customerList.get(position).getEmailAddress());
        Picasso.with(mContext).load(customerList.get(position).getProfileImagePath()).into(holder.customerImg);
    }

    @Override
    public int getItemCount() {
        return customerList.size();
    }

    public void updateData(List<Customer> customerList) {
        this.customerList = customerList;
        notifyDataSetChanged();
    }
}
