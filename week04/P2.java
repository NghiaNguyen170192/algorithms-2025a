package week04;

import week03.ArrayList;

//Given the root of a binary tree, check if the tree is a binary search tree.
public class P2 {
    public static void main(String[] args) {
        // use InOrder traversal to store all node values
        // in an array, then check if the array is an increasing array
        BinaryTreeNode<Integer> bstTree = new BinaryTreeNode<Integer>(null, 10);
        BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(bstTree, 5);
        bstTree.left = leftChild;
        BinaryTreeNode<Integer> leftLeftChild = new BinaryTreeNode<Integer>(leftChild, 3);
        leftChild.left = leftLeftChild;
        BinaryTreeNode<Integer> rightLeftChild = new BinaryTreeNode<Integer>(leftChild, 8);
        leftChild.right = rightLeftChild;
        BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(bstTree, 16);
        bstTree.right = rightChild;
        BinaryTreeNode<Integer> leftRightChild = new BinaryTreeNode<Integer>(rightChild, 12);
        rightChild.left = leftRightChild;
        BinaryTreeNode<Integer> rightRightChild = new BinaryTreeNode<Integer>(rightChild, 20);
        rightChild.right = rightRightChild;

        // Apply in-order traversal on this tree
        // Provide an array list to store the visited values
        // to check if the array list is sorted
        System.out.println("Result 1");
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(bstTree, list);

        // check if the array list is sorted
        boolean isSorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("\nThe tree is a BST");
        } else {
            System.out.println("\nThe tree is NOT a BST");
        }

        // update the left and right references in the root
        // the result is not a BST anymore
        bstTree.left = rightChild;
        bstTree.right = leftChild;
        System.out.println("\nResult 2");
        list = new ArrayList<>();  // create a new list for the new tree
        inOrder(bstTree, list);
        // check if the array list is sorted
        isSorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("\nThe tree is a BST");
        } else {
            System.out.println("\nThe tree is NOT a BST");
        }
    }

    static void inOrder(BinaryTreeNode<Integer> node, ArrayList<Integer> list) {
        if (node != null) {
            inOrder(node.left, list);
            // visit node
            list.insertAt(list.size(), node.data);
            System.out.print(" " + node.data);
            inOrder(node.right, list);
        }
    }
}
