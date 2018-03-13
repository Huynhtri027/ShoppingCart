package com.vinitvs.shoppingcart.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vinitvs.shoppingcart.R;

/**
 * Created by Vinit on 3/3/2018.
 */

public class CustomerListViewHolder extends RecyclerView.ViewHolder {

    ImageView customer_img;
    TextView customer_name;
    TextView customer_email;

    public CustomerListViewHolder(View itemView) {
        super(itemView);
        customer_img = itemView.findViewById(R.id.img_customer);
        customer_name = itemView.findViewById(R.id.txt_customer_name);
        customer_email = itemView.findViewById(R.id.txt_customer_email);
    }

}
