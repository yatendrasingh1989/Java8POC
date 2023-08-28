package com.yaten.java8.Threads;

public class ThreadInterface implements Runnable{

    /**
     *
     */
    @Override
    public void run() {
        System.out.println(" My name is -"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadInterface());
        t1.setName("Thread-1");
        Thread t2 = new Thread(new ThreadInterface());
        t1.setName("Thread-2");

        t1.start();
        t2.start();

    }
}
