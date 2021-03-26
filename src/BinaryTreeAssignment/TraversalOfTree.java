package BinaryTreeAssignment;

import java.util.Queue;
import java.util.LinkedList;

import BinaryTree.BinaryTreeNode;

import static BinaryTree.BinaryTreeImplementation.levelWiseInput;

public class TraversalOfTree {

    public static void postOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void inOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void levelOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        Queue<BinaryTreeNode<Integer> > pendingNodes = new LinkedList<>() ;
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
            pendingNodes.poll();
        }

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = levelWiseInput() ;
        System.out.println("PreOrder Traversal ");
        preOrder(root) ;
        System.out.println();
        System.out.println("InOrder Traversal ");
        inOrder(root) ;
        System.out.println();
        System.out.println("PostOrder Traversal ");
        postOrder(root);
        System.out.println();
        System.out.println("LevelOrder Traversal ");
        levelOrder(root);
    }

}
