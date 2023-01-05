package com.example.designpaternpractise.behavioral.null_safe;

public class NullCustomer extends AbstractCustomer{


    @Override
    String getName() {
        return "not exists in db";
    }

    @Override
    boolean isNull() {
        return true;
    }
}
