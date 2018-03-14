package com.yaten.java8.DataStructure;

import java.util.ArrayList;

public class DSQueueArrayListImpl<X> {
    ArrayList<X> queue;

    public DSQueueArrayListImpl(){
        queue=new ArrayList<>();
    }

    public void enQueue(X data){
        queue.add(data);
        System.out.println("Enqueued :"+data.toString() +" At index:"+queueSize());
    }

    public X deQueue(){
        if (queue.size()==0){
            System.out.println("Underflow.");
        }
        System.out.println("Dequeued :"+queue.get(0).toString());
        return queue.remove(0);
    }

    public int queueSize(){
        System.out.println(queue.size());
        return queue.size();
    }

    public boolean isEmpty(){
        if (queue.size()==0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "DSQueueArrayListImpl{" +
                "queue=" + queue.toString() +
                '}';
    }
}
