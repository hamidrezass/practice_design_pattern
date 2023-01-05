package com.example.designpaternpractise.behavioral.null_safe;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name=name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    boolean isNull() {
        return false;
    }
}
