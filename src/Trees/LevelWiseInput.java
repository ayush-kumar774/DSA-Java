package Trees;

import Queue.QueueUsingLL;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class LevelWiseInput {
    public static TreeNode<Integer> takeInput()
    {
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
    public static void printLevelWise(TreeNode<Integer> root)
    {
        if (root == null) {
            return;
        }
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>() ;
        pendingNodes.add(root) ;
        while (pendingNodes.size() != 0)
        {
            System.out.print(pendingNodes.peek().data + " : ");
            for (int i = 0 ; i < pendingNodes.peek().children.size(); i++)
            {
                System.out.print(pendingNodes.peek().children.get(i).data + " , ");
                pendingNodes.add(pendingNodes.peek().children.get(i));
            }
            System.out.println();
            pendingNodes.poll();
        }
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput() ;
//        print(root) ;
        printLevelWise(root);
    }
}
