package com.example.designpaternpractise.creational.singletone;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}

    public static  synchronized ThreadSafeSingleton getInstance() {
    //    synchronized (ThreadSafeSingleton.class){
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
            return instance;
      //  }

    }

}
