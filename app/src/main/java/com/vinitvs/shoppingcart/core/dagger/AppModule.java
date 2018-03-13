package com.vinitvs.shoppingcart.core.dagger;

import android.content.Context;

import com.vinitvs.shoppingcart.core.ShoppingApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Vinit on 3/11/2018.
 */
@Module
public class AppModule {

    private final ShoppingApplication shoppingApplication;

    public AppModule(ShoppingApplication shoppingApplication) {
        this.shoppingApplication = shoppingApplication;
    }


    @Provides
    @Singleton
    public ShoppingApplication provideShoppingApplication() {
        return shoppingApplication;
    }


    @Provides
    @Singleton
    public Context provideContext() {
        return (Context) shoppingApplication;
    }
}