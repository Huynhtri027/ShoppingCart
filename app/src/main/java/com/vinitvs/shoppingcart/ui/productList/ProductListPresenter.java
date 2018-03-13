package com.vinitvs.shoppingcart.ui.productList;

import com.vinitvs.shoppingcart.core.ShoppingApplication;
import com.vinitvs.shoppingcart.model.Product;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Vinit on 3/11/2018.
 */

public class ProductListPresenter implements ProductListContract.Action {

    @Inject ProductListRepository productListRepository;
    private final ProductListContract.View productListView;


    ProductListPresenter(ProductListContract.View productListView) {
        this.productListView = productListView;
        ShoppingApplication.getInstance().getAppComponent().inject(this);

    }

    @Override
    public void loadProducts() {
        List<Product> products = productListRepository.getProductFromDataSource();
        productListView.showProducts(products);
    }


    @Override
    public void addNewProduct() {

    }


    @Override
    public void addProductToCart() {

    }


    @Override
    public void editProduct() {

    }


    @Override
    public void googleSearch() {

    }


    @Override
    public void deleteProduct() {

    }
}
