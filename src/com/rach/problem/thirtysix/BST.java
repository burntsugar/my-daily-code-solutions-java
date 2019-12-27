package com.rach.problem.thirtysix;

public class BST {

    Node root;
    Node secondLargest;

    public BST(){
        root = null;
    }

    public void insert(int data){
        this.root = recursiveInsert(this.root, data);
    }

    public Node recursiveInsert(Node node, int data) {

        if (node == null){
            node = new Node(data,null,null);
            return node;
        }

        if (data < node.getData()) {
            node.setLeft(recursiveInsert(node.getLeft(), data));
        } else {
           node.setRight(recursiveInsert(node.getRight(),data));
        }
        return node;
    }

    public Node findLargest(){
        return largestNode(this.root);
    }

    public Node largestNode(Node node){
        if (node == null) return null;
        if (node.getRight() == null) return node;
        return largestNode(node.getRight());
    }

    public class Count {
        int c = 0;
    }

    public void findSecondLargest(){
        Count c = new Count();
        secondLargestNode(this.root, c);
    }

    public void secondLargestNode(Node node, Count c){
        if (node == null || c.c >= 2) return;
        secondLargestNode(node.getRight(),c);
        c.c += 1;
        if (c.c ==2){
            secondLargest = node;
            return;
        }
        secondLargestNode(node.getLeft(),c);
    }

    public void printTree(){
        printNode(this.root,"root: ");
    }

    public void printNode(Node node, String label){
        if (node == null) return;
        System.out.println(label + " " + node.getData());
        printNode(node.getLeft(), label + " left");
        printNode(node.getRight(), label + " right");
    }

}
