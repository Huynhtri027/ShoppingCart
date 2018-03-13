package com.vinitvs.shoppingcart.ui.productList;


import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.vinitvs.shoppingcart.R;
import com.vinitvs.shoppingcart.model.Product;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductListFragment extends Fragment implements ProductListContract.View {
    @BindView(R.id.rv_product)
    RecyclerView recyclerViewProduct;
    private boolean debug = false;
    private View mRootView;
    private ProductListPresenter productListPresenter;
    ProductListAdapter productListAdapter;
    private List<Product> products;

    public ProductListFragment() {

    }

    public static ProductListFragment newInstance() {
        ProductListFragment productListFragment = new ProductListFragment();
        Bundle args = new Bundle();
        productListFragment.setArguments(args);
        return productListFragment;
    }

    @Override
    public void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        if (savedInstances == null) {
            if (debug) {
                Log.i("DEBUG", "has arguments");
            }
        } else {

        }
    }

    private void initializeViews() {
        ButterKnife.bind(this, mRootView);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_product_list, container, false);
        productListPresenter = new ProductListPresenter(this);
        initializeViews();
        products = new ArrayList<>();
        productListAdapter = new ProductListAdapter(products, getActivity());
        recyclerViewProduct.setAdapter(productListAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerViewProduct.setLayoutManager(layoutManager);
        recyclerViewProduct.addItemDecoration(new RecyclerDecoration(getResources().getDrawable(R.drawable.recyclerview_border)));

        productListPresenter.loadProducts();
        return mRootView;
    }


    @Override
    public void showProducts(List<Product> products) {
        productListAdapter.updateData(products);
    }

    @Override
    public void showAddProductDialog() {

    }

    @Override
    public void showEditProductForm() {

    }
}


class RecyclerDecoration extends RecyclerView.ItemDecoration {

    Drawable d;

    RecyclerDecoration(Drawable d) {
        this.d = d;
    }

    @Override
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        final int left = parent.getPaddingLeft();
        final int right = parent.getWidth() - parent.getPaddingRight();

        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child
                    .getLayoutParams();
            final int top = child.getBottom() + params.bottomMargin;
            final int bottom = top + d.getIntrinsicHeight();
            Log.i("dim", "Position   " + String.valueOf(i) + "    " + String.valueOf(left) + "   " + String.valueOf(top) + "   " + String.valueOf(right) + "   " + String.valueOf(bottom));
            d.setBounds(left, top, right, bottom);
            d.draw(canvas);
        }
    }

}
