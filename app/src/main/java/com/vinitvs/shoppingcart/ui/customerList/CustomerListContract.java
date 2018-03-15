package com.vinitvs.shoppingcart.ui.customerList;

import com.vinitvs.shoppingcart.model.Customer;

import java.util.List;

/**
 * Created by Vinit on 3/13/2018.
 * Contract
 */

public interface CustomerListContract {
    public interface View{
        void showCustomers(List<Customer> customerList);
        void addCustomerFormToRepo();
        void editCustomerToRepo();
    }

    public interface Action{
        void loadCustomerFromRepo();
        void addCustomerToRepo();
        void editCustomerToRepo();
        void deleteCustomerData();
    }

    public interface Repository{
        List<Customer> getCustomerData();
        void addCustomerData();
        void editCustomerData();
        void deleteCustomerData();
    }

}
