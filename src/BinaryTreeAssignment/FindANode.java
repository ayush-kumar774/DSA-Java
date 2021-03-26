package BinaryTreeAssignment;

import BinaryTree.BinaryTreeNode;

import java.util.Scanner;

import static BinaryTree.BinaryTreeImplementation.levelWiseInput;

public class FindANode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search ");
        int target = sc.nextInt();
        BinaryTreeNode<Integer> root = levelWiseInput() ;
        if (searchNode(root, target)) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }

    public static boolean searchNode(BinaryTreeNode<Integer> root, int target) {
        if (root == null) {
            return false ;
        }
        if (root.data == target) {
            return true ;
        }
        return (false || searchNode(root.left, target) || searchNode(root.right, target)) ;
    }
}
