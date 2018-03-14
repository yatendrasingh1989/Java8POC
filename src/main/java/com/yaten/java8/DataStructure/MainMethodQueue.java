package com.yaten.java8.DataStructure;

public class MainMethodQueue {
    public static void main(String[] str){
        DSQueueArrayListImpl<String> queue= new DSQueueArrayListImpl<>();
        System.out.println(queue.isEmpty());
        queue.enQueue("Yatendra");
        queue.enQueue("Harnu");
        queue.enQueue("Deepak");
        queue.enQueue("Krishna");

        queue.queueSize();

        queue.deQueue();

        queue.queueSize();

        System.out.println(queue.toString());

    }
}
