package com.vinitvs.shoppingcart.ui.productList;

import com.vinitvs.shoppingcart.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinit on 3/11/2018.
 */

public interface ProductListContract {
    public interface View{
        void showProducts(List<Product> products);
        void showAddProductDialog();
        void showEditProductForm();
    }

    public interface Action{
        void loadProducts();
        void addNewProduct();
        void addProductToCart();
        void editProduct();
        void googleSearch();
        void deleteProduct();
    }

    public interface Repository {
        List<Product> getProductFromDataSource();
        void addProductToDataSource();
        void removeProductFromDataSource();
        void editProductToDataSource();

    }


}
