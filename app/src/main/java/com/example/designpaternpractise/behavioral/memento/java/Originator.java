package com.example.designpaternpractise.behavioral.memento.java;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


   public void getStateFromMemento(Memento memento){
        state=memento.getState();
   }

   public Memento setStateToMemento(){

        return new Memento(state);
   }
}
