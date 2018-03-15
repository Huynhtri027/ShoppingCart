package com.vinitvs.shoppingcart.common;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.vinitvs.shoppingcart.R;
import com.vinitvs.shoppingcart.ui.customerList.CustomerListFragment;
import com.vinitvs.shoppingcart.ui.productList.ProductListAdapter;
import com.vinitvs.shoppingcart.ui.productList.ProductListFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.appBar)
    Toolbar toolbar;

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initalizeViews();
        setSupportActionBar(toolbar);
        //openFragmentCustomer();
        //openFragmentProduct();
        setViewPager();
        setTabLayout();
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        }

    private void setTabLayout() {
        TabLayout.Tab tab1 = tabLayout.newTab();
        tab1.setText("Products");
        tab1.setIcon(R.drawable.pear);
        tabLayout.addTab(tab1);

        TabLayout.Tab tab2 = tabLayout.newTab();
        tab2.setText("Customer");
        tab2.setIcon(R.drawable.pear);
        tabLayout.addTab(tab2);


        TabLayout.Tab tab3 = tabLayout.newTab();
        tab3.setText("Checkout");
        tab3.setIcon(R.drawable.pear);
        tabLayout.addTab(tab3);

    }

    private void setViewPager() {
        FragmentManager fm = getSupportFragmentManager();
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(fm);
        viewPager.setAdapter(viewPagerAdapter);

    }

    private void openFragmentProduct() {
        ProductListFragment productListFragment = ProductListFragment.newInstance();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //ft.add(R.id.frag_container, productListFragment);
        ft.commit();
    }

    private void initalizeViews() {
        ButterKnife.bind(this);
    }

    private void openFragmentCustomer() {

        CustomerListFragment customerListFragment = CustomerListFragment.newInstance();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //ft.add(R.id.frag_container, customerListFragment);
        ft.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        // Define the listener
        searchItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // Do something when action item collapses
                Toast.makeText(getApplicationContext(), "Collapse", Toast.LENGTH_SHORT).show();
                return true;  // Return true to collapse action view
            }

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                Toast.makeText(getApplicationContext(), "Expand ", Toast.LENGTH_SHORT).show();
                // Do something when expanded
                return true;  // Return true to expand action view
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.share:
                Toast.makeText(getApplicationContext(), "Share", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
