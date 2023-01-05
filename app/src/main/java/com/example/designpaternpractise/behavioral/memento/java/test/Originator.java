package com.example.designpaternpractise.behavioral.memento.java.test;

public class Originator {

    private String state;
    //id, name , .....


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {

        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();

    }


}
