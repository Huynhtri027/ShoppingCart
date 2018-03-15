package com.vinitvs.shoppingcart.core.dagger;

import com.vinitvs.shoppingcart.ui.customerList.CustomerListRepository;
import com.vinitvs.shoppingcart.ui.productList.ProductListRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Vinit on 3/13/2018.
 */

@Module
public class RepositoryModule {


    @Provides
    @Singleton
    public ProductListRepository provideProductList() {
        return new ProductListRepository();
    }

    @Singleton
    @Provides
    public CustomerListRepository provideCustomerRepository(){
        return new CustomerListRepository();
    }
}
