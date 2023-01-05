package com.example.designpaternpractise.behavioral.memento.java.test;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {


    private List<Memento> mementoList = new ArrayList<>();


    public List<Memento> getMementoList() {
        return mementoList;
    }

    public void addToList(Memento memento) {
        mementoList.add(memento);
    }
}
