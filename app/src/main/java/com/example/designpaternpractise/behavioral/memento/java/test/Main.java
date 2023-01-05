package com.example.designpaternpractise.behavioral.memento.java.test;


public class Main {


    public static void main(String[] args) {



        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();

        Memento memento=new Memento("state34");

        originator.setState("state1");
        originator.setState("state2");



    }


}
