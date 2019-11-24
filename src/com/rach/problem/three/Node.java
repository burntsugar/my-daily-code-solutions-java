package com.rach.problem.three;

public class Node {

    private Node left;
    private Node right;
    private String name;

    public Node(String name, Node left, Node right) {
        this.name = name;
        this.left  = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
