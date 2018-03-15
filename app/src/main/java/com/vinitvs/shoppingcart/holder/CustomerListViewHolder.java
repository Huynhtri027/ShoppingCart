package com.vinitvs.shoppingcart.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vinitvs.shoppingcart.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vinit on 3/3/2018.
 */

public class CustomerListViewHolder extends RecyclerView.ViewHolder {

    public @BindView(R.id.img_customer) ImageView customerImg ;
    public @BindView(R.id.txt_customer_name) TextView customerName ;
    public @BindView(R.id.txt_customer_email) TextView customerEmail ;


    public CustomerListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}
