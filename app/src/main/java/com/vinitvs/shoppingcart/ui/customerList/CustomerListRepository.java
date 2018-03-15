package com.vinitvs.shoppingcart.ui.customerList;

import com.vinitvs.shoppingcart.data.SampleCustomerData;
import com.vinitvs.shoppingcart.model.Customer;

import java.util.List;

/**
 * Created by Vinit on 3/15/2018.
 */

public class CustomerListRepository implements CustomerListContract.Repository {

    @Override
    public List<Customer> getCustomerData() {
        return SampleCustomerData.getCustomers();
    }

    @Override
    public void addCustomerData() {

    }

    @Override
    public void editCustomerData() {

    }

    @Override
    public void deleteCustomerData() {

    }
}
