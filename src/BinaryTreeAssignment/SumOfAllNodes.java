package BinaryTreeAssignment;

import BinaryTree.BinaryTreeNode;

import static BinaryTree.BinaryTreeImplementation.levelWiseInput;
import static BinaryTree.BinaryTreeImplementation.printLevelWise;

public class SumOfAllNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = levelWiseInput();
        printLevelWise(root);
        System.out.println("Sum of all node is " + sumOfNodes(root)) ;
    }

    public static int sumOfNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0 ;
        }
        return (root.data + sumOfNodes(root.left) + sumOfNodes(root.right));
    }
}
