package com.rach.problem.three;

public class ProblemThree {

    public static Node deserializeBinaryTree(String data) {
        String[] nodeDataStrings = data.split(",");
        return deserialize(nodeDataStrings);
    }

    static int index;

    public static Node deserialize(String[] nodeDataStrings) {
        if (index > nodeDataStrings.length || nodeDataStrings[index].equals("null")) {
            index++;
            return null;
        }

        Node node = new Node(nodeDataStrings[index++], null, null);
        node.setLeft(deserialize(nodeDataStrings));
        node.setRight(deserialize(nodeDataStrings));

        return node;
    }

    public static String serializeBinaryTree(Node rootNode) {
        if (rootNode == null) {
            return "null,";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(rootNode.getName());
        sb.append(",");

        sb.append(serializeBinaryTree(rootNode.getLeft()));
        sb.append(serializeBinaryTree(rootNode.getRight()));
        return sb.toString();
    }

    public static void printTree(Node rootNode) {
        if (rootNode == null)
            return;
        System.out.print(rootNode.getName() + " ");
        printTree(rootNode.getLeft());
        printTree(rootNode.getRight());
    }

}