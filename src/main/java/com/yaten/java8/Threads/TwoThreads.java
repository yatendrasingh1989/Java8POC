package com.yaten.java8.Threads;

public class TwoThreads implements  Runnable{
    /**
     *
     */
    @Override
    public void run() {
        System.out.println("I am "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TwoThreads(),"Thread1");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(new TwoThreads(),"Thread2");
        t2.setPriority(Thread.MIN_PRIORITY);
        Thread t3 = new Thread(new TwoThreads(),"Thread3");
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End of Main....");
    }
}
