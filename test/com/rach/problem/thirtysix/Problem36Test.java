package com.rach.problem.thirtysix;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class Problem36Test {

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    public class Add_Node {

        @Test
        void TestAddFirstNode_Node_ShouldBeReturnedAsRootNode() {
            BST bst = new BST();
            int data = 100;
            bst.insert(data);
            Node returnedRoot = bst.root;
            assertAll(
                    () -> assertTrue(returnedRoot.getRight()==null, () -> "Right of root should be null!"),
                    () -> assertTrue(returnedRoot.getLeft()==null, () -> "Left of root should be null!"),
                    () -> assertEquals(returnedRoot.getData(), data, () -> "Data should be 100!")
            );
        }
    }

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    public class Get_Largest_Node {

        BST bst;

        @BeforeEach
        public void SetUp()
        {
            int[] data = {50, 200, 20, 300};
            bst = new BST();
            for(int d:data){
                bst.insert(d);
            }
        }

        @Test
        void TestFindLargest_ShouldReturnLargestNode(){
            bst.printTree();
            int expected = 300;
            assertEquals(expected,bst.findLargest().getData(), () -> "Data should be 300!");
        }

    }

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    public class Find_Second_Largest_Node {

        BST bst;

        @BeforeEach
        public void SetUp()
        {
            int[] data = {50, 200, 20};
            bst = new BST();
            for(int d:data){
                bst.insert(d);
            }
        }

        @Test
        void TestFindSecondLargestNode_ShouldReturnSecondLargestNode(){
            bst.printTree();
            int expected = 50;
            bst.findSecondLargest();
            assertEquals(expected,bst.secondLargest.getData());
        }

    }
}
