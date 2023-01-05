package com.example.designpaternpractise.behavioral.null_safe;

public class FactoryCustomer {
    public static final String[] list = {"ali", "reza", "hamid", "majid"};

    public AbstractCustomer getCustomer(String name) {

        for (int i = 0; i < list.length; i++) {

            if (name.equalsIgnoreCase(list[i])) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }



}
