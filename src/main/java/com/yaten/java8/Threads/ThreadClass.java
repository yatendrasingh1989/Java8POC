package com.yaten.java8.Threads;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("My name is -"+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.setName("Thread-Yatendra");
        ThreadClass t2 = new ThreadClass();
        t2.setName("Thread-Harneet");
        t1.start();
        t2.start();
    }

}
