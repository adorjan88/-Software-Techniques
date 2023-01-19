package com.mainPackage;

import com.customer.Customer;
import com.customer.Dog;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("John",19);
        Dog dog = new Dog("Phillip",3);

        Generics<Customer> customerGenerics = new Generics<>(customer);
        Generics<Dog> dogGenerics = new Generics<>(dog);

        System.out.println(customerGenerics.getObj());
        System.out.println(dogGenerics.getObj());

        String url = "www.google.com";
        try{
            InetAddress inetAddress = InetAddress.getByName(url);
            System.out.println(Arrays.toString(inetAddress.getAddress()));
            System.out.println(inetAddress.getHostAddress());
        }catch (UnknownHostException e){
            e.printStackTrace();
        }

    }
}