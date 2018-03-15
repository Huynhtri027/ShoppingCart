package com.vinitvs.shoppingcart.core.dagger;

import com.vinitvs.shoppingcart.model.Product;
import com.vinitvs.shoppingcart.ui.customerList.CustomerListAdapter;
import com.vinitvs.shoppingcart.ui.customerList.CustomerListPresenter;
import com.vinitvs.shoppingcart.ui.productList.ProductListPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Vinit on 3/11/2018.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                RepositoryModule.class
        }
)

public interface AppComponent {
    void inject(ProductListPresenter productListPresenter);
    void inject(CustomerListPresenter customerListPresenter);
    void inject(CustomerListAdapter customerListPresenter);

}
