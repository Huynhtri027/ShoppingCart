package com.vinitvs.shoppingcart.ui.checkout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vinitvs.shoppingcart.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheckoutFragment extends Fragment {
    private View mRootViewCheckout;

    public CheckoutFragment() {
        // Required empty public constructor
    }


    public static CheckoutFragment newInstance() {
        CheckoutFragment checkoutFragment = new CheckoutFragment();
        Bundle args = new Bundle();
        checkoutFragment.setArguments(args);
        return checkoutFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootViewCheckout = inflater.inflate(R.layout.fragment_checkout, container, false);
        return mRootViewCheckout;
    }

}
