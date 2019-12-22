package com.rach.problem.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemThreeTest {

    @Test
    public void testOne(){

        Node rootNode = new Node("root", new Node("left", new Node("left.left",null,null),null), new Node("right",null,null));

        ProblemThree.printTree(rootNode);
        System.out.println();

        String serialized = ProblemThree.serializeBinaryTree(rootNode);
        System.out.println(serialized);
        assertEquals("root,left,left.left,null,null,null,right,null,null,", serialized);

        Node start = ProblemThree.deserializeBinaryTree(serialized);
        assertEquals("left.left", start.getLeft().getLeft().getName());
        ProblemThree.printTree(start);

    }

}
