package com.yaten.java8.DataStructure;

import java.util.Objects;
import java.util.stream.Stream;

public class DSLinkedList {
    private Node head;
    int size;
    private Node tail;

    public DSLinkedList() {
        head = new Node();
        tail = new Node();
        size = 0;
    }

    public void add(String data) {
        Node current = new Node();
        current.setData(data);
        if (0 == size) {
            head = current;
            tail = current;
        } else {
            tail.setNextNode(current);
            tail = current;
        }
        size++;
        System.out.println("Node added:" + current.toString() + " at index:" + size);

    }

    public void deleteAtIndex(int index) {
        if (0 == index || size < index) {
            System.out.println("Invalid Index");
            return;
        }
        Node currentNode = head;
        Node nodeToBeDeleted = null;
        int i = 2;
        while (i++ < index) {
            currentNode = currentNode.getNextNode();
        }
        if (1==index){
            nodeToBeDeleted=head;
            head=head.getNextNode();
        }
        else{
            nodeToBeDeleted=currentNode.getNextNode();
            currentNode.setNextNode(nodeToBeDeleted.getNextNode());
        }
        size--;
        System.out.println("Deleted Node :" + nodeToBeDeleted.toString() + " at index:" + index);
    }

    public void insertAtIndex(String data,int index ){
        if(index<1 || index>size+1){
            System.out.println("Invalid Index");
            return;
        }
        Node dataNode= new Node();
        dataNode.setData(data);
        Node currentNode=head;
        int i=1;
        while(i++<index){
            currentNode=currentNode.getNextNode();
        }
        if(head.equals(currentNode)){
            head=dataNode;
            size++;
        }else {
            dataNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(dataNode);
        }
        System.out.println("Node added:" + dataNode.toString() + " at index:" + index);
    }

    public void printList() {
        Node currentNode = head;
        while (Objects.nonNull(currentNode)) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

    public class Node {
        private String data;
        private Node nextNode;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}
