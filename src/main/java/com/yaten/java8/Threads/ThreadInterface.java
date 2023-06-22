package com.yaten.java8.Threads;

public class ThreadInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is started..."+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadInterface(),"Child Thread");
        t1.start();
        System.out.println("End of main method..."+Thread.currentThread().getName());


    }
}
