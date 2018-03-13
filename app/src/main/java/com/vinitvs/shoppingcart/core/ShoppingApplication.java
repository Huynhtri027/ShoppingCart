package com.vinitvs.shoppingcart.core;

import android.app.Application;

import com.squareup.otto.Bus;
import com.vinitvs.shoppingcart.core.dagger.AppComponent;
import com.vinitvs.shoppingcart.core.dagger.AppModule;
import com.vinitvs.shoppingcart.core.dagger.DaggerAppComponent;

/**
 * Created by Vinit on 3/11/2018.
 */

public class ShoppingApplication extends Application {

    private static AppComponent appComponent;
    private static ShoppingApplication instance = new ShoppingApplication();

    public static ShoppingApplication getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent();
    }

    public AppComponent getAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();

        }


        return appComponent;
    }
}
