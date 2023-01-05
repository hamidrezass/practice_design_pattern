package com.example.designpaternpractise.creational.singletone;

public  class Singleton {
    private static Singleton instance;
    public String value;
    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static synchronized Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
        static class ThreadFoo implements Runnable {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance("FOO");
                System.out.println(singleton.value);}
        }
       static   class ThreadBar implements Runnable {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance("BAR");
                System.out.println(singleton.value);
            }
        }

    }
