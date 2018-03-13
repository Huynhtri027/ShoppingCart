package com.vinitvs.shoppingcart.ui.productList;

import com.vinitvs.shoppingcart.data.SampleProductData;
import com.vinitvs.shoppingcart.model.Product;

import java.util.List;

/**
 * Class responsible for retrieving data from data source(Database here)
 */

public class ProductListRepository implements ProductListContract.Repository {


    @Override
    public List<Product> getProductFromDataSource() {
        return SampleProductData.getSampleProducts();
    }

    @Override
    public void addProductToDataSource() {

    }

    @Override
    public void removeProductFromDataSource() {

    }

    @Override
    public void editProductToDataSource() {

    }
}
