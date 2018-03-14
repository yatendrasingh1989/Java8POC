package com.yaten.java8.DataStructure;

import java.util.Objects;

public class DSDoublyLinkedList {
    private Node head;
    int size;
    private Node tail;

    public void add(String data) {
        Node dataNode = new Node();
        dataNode.setData(data);
        if (Objects.isNull(head)) {
            head = dataNode;
            tail = dataNode;
        } else {
            tail.setNextNode(dataNode);
            dataNode.setPreviousNode(tail);
            tail = dataNode;
        }
        size++;
        System.out.println("Node added:" + dataNode.toString() + " at index:" + size);
    }

    public void insertAtIndex(int index, String data) {
        if (index < 1 || index > size + 1) {
            System.out.println("Invalid Index");
            return;
        }
        Node dataNode = new Node();
        dataNode.setData(data);

        Node currentNode = head;
        int i = 2;
        while (i++ < index) {
            currentNode = currentNode.getNextNode();
        }
        if(currentNode.equals(head)){
            dataNode.setNextNode(currentNode);
            currentNode.setPreviousNode(dataNode);
            head=dataNode;
        }else {
            dataNode.setNextNode(currentNode.getNextNode());
            dataNode.setPreviousNode(currentNode);
            currentNode.setNextNode(dataNode);
        }
        size++;

        System.out.println("Node added:" + dataNode.toString() + " at index:" + index);
    }

    public void deleteNode(int index){
        if (index < 1 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        Node currentNode=head;
        Node nodeToBeDeleted=null;
        int i=1;
        while(i++<index){
            currentNode=currentNode.getNextNode();
        }
        if(1==index){
            nodeToBeDeleted=head;
            head=nodeToBeDeleted.getNextNode();
        }else{
            nodeToBeDeleted=currentNode.getNextNode();
            currentNode.setNextNode(nodeToBeDeleted.getNextNode());
            nodeToBeDeleted.getNextNode().setPreviousNode(currentNode);
        }
        size--;
        System.out.println("Deleted Node :" + nodeToBeDeleted.toString() + " at index:" + index);
    }
    public void printList() {
        Node currentNode = head;
        while (Objects.nonNull(currentNode)) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

    public void printReverse() {
        Node currentNode = tail;
        while (Objects.nonNull(currentNode)) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getPreviousNode();
        }
    }

    public class Node {
        private String data;
        private Node nextNode;
        private Node previousNode;

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

        public Node getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}
