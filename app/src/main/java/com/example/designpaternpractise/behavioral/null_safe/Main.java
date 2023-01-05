package com.example.designpaternpractise.behavioral.null_safe;

public class Main {

    public static void main(String[] args) {

        AbstractCustomer customer1 = new FactoryCustomer().getCustomer("ali");
        AbstractCustomer customer2 = new FactoryCustomer().getCustomer("majid");
        AbstractCustomer customer3 = new FactoryCustomer().getCustomer("hosein");
        AbstractCustomer customer4 = new FactoryCustomer().getCustomer("reza");
        AbstractCustomer customer5 = new FactoryCustomer().getCustomer("ali22");


        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println(customer5.getName());

    }
}
