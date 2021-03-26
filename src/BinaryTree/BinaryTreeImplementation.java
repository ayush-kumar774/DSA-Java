package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeImplementation {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = levelWiseInput() ;
        printLevelWise(root);
        printLevelWise2(root);
        System.out.println("Total number of nodes are " + countNodes(root));
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            System.out.println("Root is null");
        }

        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>() ;
        pendingNodes.add(root);
        while (pendingNodes.size() != 0)
        {
            System.out.print(pendingNodes.peek().data + " : ");

            if (pendingNodes.peek().left != null) {
                System.out.print("L : " + pendingNodes.peek().left.data);
                pendingNodes.add(pendingNodes.peek().left);
            }
            if (pendingNodes.peek().right != null) {
                System.out.print(" R : " + pendingNodes.peek().right.data);
                pendingNodes.add(pendingNodes.peek().right);
            }

            System.out.println();

            pendingNodes.poll();
        }
    }

    public static BinaryTreeNode<Integer> levelWiseInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null ;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (pendingNodes.size() != 0)
        {
            BinaryTreeNode<Integer> front = pendingNodes.peek();
            pendingNodes.poll();
            System.out.println("Enter left child of " + front.data);
            int leftChildData = sc.nextInt();
            if (leftChildData != -1)
            {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChildData);
                front.left = child;
                pendingNodes.add(child);
            }
            System.out.println("Enter right child of " + front.data);
            int rightChildData = sc.nextInt();
            if (rightChildData != -1)
            {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChildData);
                front.right = child;
                pendingNodes.add(child);
            }
        }
        return root;
    }

    public static int countNodes(BinaryTreeNode<Integer> root)
    {
        if(root == null) {
            return 0 ;
        }
        int ans = 1 ;
        ans += countNodes(root.left) ;
        ans += countNodes(root.right) ;
        return ans ;
    }


    public static void printLevelWise2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            System.out.println("Root is null");
            return;
        }

        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>() ;
        pendingNodes.add(root);
        while (pendingNodes.size() != 0)
        {
            System.out.print(pendingNodes.peek().data + " ");

            if (pendingNodes.peek().left != null) {
                pendingNodes.add(pendingNodes.peek().left);
            }
            if (pendingNodes.peek().right != null) {
                pendingNodes.add(pendingNodes.peek().right);
            }

            System.out.println();

            pendingNodes.poll();
        }
    }

}
