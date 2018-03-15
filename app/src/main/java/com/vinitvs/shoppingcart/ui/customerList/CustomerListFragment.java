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
import com.vinitvs.shoppingcart.model.Customer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerListFragment extends Fragment implements CustomerListContract.View {

    ArrayList<Customer> customersArrayList;

    private View mRootView;
    private CustomerListPresenter customerListPresenter;
    @BindView(R.id.rv_customers)
    RecyclerView customerRecycler;
    @BindView(R.id.txt_no_customers)
    TextView noCustomer;
    LinearLayoutManager linearLayoutManager;
    CustomerListAdapter customerListAdapter;

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
        customerListPresenter = new CustomerListPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_customer_list, container, false);
        initlizeViews();
        customerRecycler.setHasFixedSize(true);
        List<Customer> customerList = new ArrayList<>();
        customerListAdapter = new CustomerListAdapter(customerList , getActivity());
        customerRecycler.setAdapter(customerListAdapter);
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        customerRecycler.setLayoutManager(linearLayoutManager);
        customerListPresenter.loadCustomerFromRepo();
        return mRootView;
    }



    private void initlizeViews() {
        ButterKnife.bind(this, mRootView);
    }


    @Override
    public void showCustomers(List<Customer> customers) {
        customerListAdapter.updateData(customers);
    }

    @Override
    public void addCustomerFormToRepo() {

    }

    @Override
    public void editCustomerToRepo() {

    }
}
