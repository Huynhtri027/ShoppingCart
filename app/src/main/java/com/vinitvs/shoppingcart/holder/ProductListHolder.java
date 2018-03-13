package com.vinitvs.shoppingcart.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vinitvs.shoppingcart.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vinit on 3/9/2018.
 */

public class ProductListHolder extends RecyclerView.ViewHolder {

    public @BindView(R.id.txt_productDescription)
    TextView productDescription;

    public @BindView(R.id.txt_productName)
    TextView productName;

    public @BindView(R.id.txt_productCategory)
    TextView productCategory;

    public @BindView(R.id.img_product)
    ImageView productImage;

    public View mHolderView;

    public ProductListHolder(View mRootView) {
        super(mRootView);
        mHolderView = mRootView;
        initializeViews();

    }

    public void initializeViews() {
        ButterKnife.bind(this, mHolderView);
    }
}
