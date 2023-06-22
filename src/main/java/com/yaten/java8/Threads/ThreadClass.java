package com.yaten.java8.Threads;

public class ThreadClass extends Thread{
    public static void main(String[] args) {
        ThreadClass t1= new ThreadClass();
        t1.start();
        System.out.println("End of main...");
    }

    @Override
    public void run() {
        System.out.println("Thread is started....");
    }
}
