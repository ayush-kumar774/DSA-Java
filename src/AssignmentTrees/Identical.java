package AssignmentTrees;

import Queue.QueueUsingLL;
import Trees.TreeNode;

import java.util.Scanner;

public class Identical {
    public static boolean isIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2)
    {
        if (root1 == null || root2 == null) {
            return false ;
        }
        boolean ans = true ;
        if (!(root1.data.equals(root2.data))) {
            return false ;
        }
        if (root1.children.size() != root2.children.size()) {
            return false ;
        }
        for(int i = 0, j = 0 ; i < root1.children.size() && j < root2.children.size(); i++ , j++)
        {
            ans = ans && isIdentical(root1.children.get(i), root2.children.get(j));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter data of tree 1");
        TreeNode<Integer> root1 = levelWiseInput() ;
        System.out.println("Enter data of tree 2");
        TreeNode<Integer> root2 = levelWiseInput() ;
        System.out.println("Trees are identical? " + isIdentical(root1, root2));
    }

    public static TreeNode<Integer> levelWiseInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data ");
        int rootData = sc.nextInt() ;
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData) ;
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter num of children of " + frontNode.data);
            int numChildren = sc.nextInt();
            for(int i = 1 ; i <= numChildren; i++) {
                System.out.println("Enter " + i + "th child of " + frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }
        return root;
    }
}
