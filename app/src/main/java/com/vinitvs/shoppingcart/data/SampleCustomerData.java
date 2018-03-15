package com.vinitvs.shoppingcart.data;

import com.vinitvs.shoppingcart.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentine on 4/22/2016.
 */
public class SampleCustomerData {

    public static List<Customer> getCustomers(){
        List<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer();
        customer1.setCustomerName("Debbie Sam");
        customer1.setEmailAddress("deb@email.net");
        customer1.setProfileImagePath("http://www.clker.com/cliparts/c/e/7/4/1195444712973371681Gerald_G_Boy_Face_Cartoon_4.svg.med.png");
        customers.add(customer1);


        Customer customer2 = new Customer();
        customer2.setCustomerName("Keisha Williams");
        customer2.setEmailAddress("diva@comcast.com");
        customer2.setProfileImagePath("http://www.clker.com/cliparts/l/g/g/z/7/7/blond-man-with-mustache-md.png");
        customers.add(customer2);


        Customer customer3 = new Customer();
        customer3.setCustomerName("Gregg McQuire");
        customer3.setEmailAddress("emailing@nobody.com");
        customer3.setProfileImagePath("http://www.clker.com/cliparts/T/p/H/K/c/6/girl-face-with-glasses-md.png");
        customers.add(customer3);


        Customer customer4 = new Customer();
        customer4.setCustomerName("Jamal Puma");
        customer4.setEmailAddress("jamal@hotmail.com");
        customer4.setProfileImagePath("http://www.clker.com/cliparts/k/H/A/H/P/7/girl-with-pigtails-md.png");
        customers.add(customer4);


        Customer customer5 = new Customer();
        customer5.setCustomerName("Dora Keesler");
        customer5.setEmailAddress("dora@yahoo.com");
        customer5.setProfileImagePath("http://www.clker.com/cliparts/p/k/a/M/v/B/beard-man-md.png");
        customers.add(customer5);

        Customer customer6 = new Customer();
        customer6.setCustomerName("Anthony Lopez");
        customer6.setEmailAddress("toney@gmail.com");
        customer6.setProfileImagePath("http://www.clker.com/cliparts/K/N/d/l/i/Y/girl-pigtails-glasses-md.png");
        customers.add(customer6);

        Customer customer7 = new Customer();
        customer7.setCustomerName("Ricardo Weisel");
        customer7.setEmailAddress("ricardo@gmail.com");
        customer7.setProfileImagePath("http://www.clker.com/cliparts/I/0/9/O/n/e/girl-with-pigtails-md.png");
        customers.add(customer7);

        Customer customer8 = new Customer();
        customer8.setCustomerName("Angele Lu");
        customer8.setEmailAddress("angele@ymail.com");
        customer8.setProfileImagePath("http://www.clker.com/cliparts/l/P/v/d/T/y/smiling-brown-haired-boy-with-glasses-md.png");
        customers.add(customer8);


        Customer customer9 = new Customer();
        customer9.setCustomerName("Brendon Suh");
        customer9.setEmailAddress("brendon@outlook.com");
        customer9.setProfileImagePath("http://www.clker.com/cliparts/8/p/s/q/f/p/smiling-girl-face-balck-white-md.png");
        customers.add(customer9);


        Customer customer10 = new Customer();
        customer10.setCustomerName("Pietro Augustino");
        customer10.setEmailAddress("pietro@company.com");
        customer10.setProfileImagePath("http://www.clker.com/cliparts/z/e/9/f/k/S/brunette-boy-md.png");
        customers.add(customer10);


        Customer customer11 = new Customer();
        customer11.setCustomerName("Matt Zebrotta");
        customer11.setEmailAddress("matt@stopasking.com");
        customer11.setProfileImagePath("http://www.clker.com/cliparts/T/p/H/K/c/6/girl-face-with-glasses-md.png");
        customers.add(customer11);

        Customer customer12 = new Customer();
        customer11.setCustomerName("James McGiney");
        customer11.setEmailAddress("james@outlook.com");
        customer11.setProfileImagePath("http://www.clker.com/cliparts/h/J/c/p/j/D/smiling-man-with-blond-hair-and-mustache-md.png");
        customers.add(customer11);
        return customers;
    }
}
