package com.vinitvs.shoppingcart.ui.customerList;

import com.vinitvs.shoppingcart.core.ShoppingApplication;
import com.vinitvs.shoppingcart.model.Customer;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Vinit on 3/15/2018.
 */

public class CustomerListPresenter implements CustomerListContract.Action {

    @Inject CustomerListRepository customerListRepository;

    private CustomerListContract.View mView;
    public CustomerListPresenter(CustomerListContract.View mView){
        this.mView = mView;
        ShoppingApplication.getInstance().getAppComponent().inject(this);
    }

    @Override
    public void loadCustomerFromRepo() {
        mView.showCustomers(customerListRepository.getCustomerData());
    }

    @Override
    public void addCustomerToRepo() {

    }

    @Override
    public void editCustomerToRepo() {

    }

    @Override
    public void deleteCustomerData() {

    }
}
