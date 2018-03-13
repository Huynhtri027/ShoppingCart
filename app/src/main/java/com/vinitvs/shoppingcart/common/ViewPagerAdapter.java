package com.vinitvs.shoppingcart.common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vinitvs.shoppingcart.ui.checkout.CheckoutFragment;
import com.vinitvs.shoppingcart.ui.customerList.CustomerListFragment;
import com.vinitvs.shoppingcart.ui.productList.ProductListFragment;

//FragmentStatePagerAdapter

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment selectedFragment = null;
        switch (position) {
            case 0:
                selectedFragment = ProductListFragment.newInstance();
                break;
            case 1:
                selectedFragment = CustomerListFragment.newInstance();
                break;
            case 2:
                selectedFragment = CheckoutFragment.newInstance();
                break;
            default:
                selectedFragment = ProductListFragment.newInstance();
        }
        return selectedFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
