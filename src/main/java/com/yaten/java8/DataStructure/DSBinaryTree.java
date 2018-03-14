package com.yaten.java8.DataStructure;

public class DSBinaryTree {

    private Node roorNode;

    

    public class Node{
      private   String data;
      private   Node leftNodee;
      private   Node rightNode;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getLeftNodee() {
            return leftNodee;
        }

        public void setLeftNodee(Node leftNodee) {
            this.leftNodee = leftNodee;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
    }
}
