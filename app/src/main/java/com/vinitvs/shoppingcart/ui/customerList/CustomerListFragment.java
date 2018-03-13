package com.vinitvs.shoppingcart.ui.customerList;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vinitvs.shoppingcart.R;
import com.vinitvs.shoppingcart.model.Customers;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerListFragment extends Fragment {

    ArrayList<Customers> customersArrayList;

    private View mRootView;
    @BindView(R.id.rv_customers)
    RecyclerView customerRecycler;
    @BindView(R.id.txt_no_customers)
    TextView noCustomer;
    CustomerListAdapter customerListAdapter;
    LinearLayoutManager linearLayoutManager;

    public CustomerListFragment() {
        // Required empty public constructor
    }

    public static CustomerListFragment newInstance() {
        CustomerListFragment customerListFragment = new CustomerListFragment();
        Bundle args = new Bundle();
        customerListFragment.setArguments(args);
        return customerListFragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_customer_list, container, false);
        initlizeViews();
        customersArrayList = new ArrayList<Customers>();

        if (customersArrayList.size() > 0) {
            loadCustomerList();
        } else {
            showEmptyDialog();
        }
        return mRootView;
    }

    private void showEmptyDialog() {
        noCustomer.setText("No Customers Yet !");
    }

    private void loadCustomerList() {
        customerRecycler.setHasFixedSize(true);
        customerListAdapter = new CustomerListAdapter(new ArrayList<Customers>());
        customerRecycler.setAdapter(customerListAdapter);
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        customerRecycler.setLayoutManager(linearLayoutManager);
    }

    private void initlizeViews() {
        ButterKnife.bind(this, mRootView);
    }


}
