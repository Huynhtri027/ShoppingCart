package com.vinitvs.shoppingcart.ui.productList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.vinitvs.shoppingcart.holder.ProductListHolder;
import com.vinitvs.shoppingcart.R;
import com.vinitvs.shoppingcart.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinit on 3/9/2018.
 */

public class ProductListAdapter extends RecyclerView.Adapter<ProductListHolder> {

    List<Product> products;
    private final Context mContext;

    public ProductListAdapter(List<Product> products, Context context) {
        this.products = products;
        this.mContext = context;
    }

    @Override
    public ProductListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_product, parent, false);
        return new ProductListHolder(v);
    }

    public void updateData(List<Product> products) {
        this.products = products;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ProductListHolder holder, int position) {
        holder.productCategory.setText(products.get(position).getCategoryName());
        holder.productName.setText(products.get(position).getProductName());
        holder.productDescription.setText(products.get(position).getDescription());
        Picasso.with(mContext).load(products.get(position).getImagePath()).into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
