package AssignmentTrees;

import Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import static Trees.LevelWiseInput.printLevelWise;
import static Trees.LevelWiseInput.takeInput;

public class ContainElementX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() ;
        TreeNode<Integer> root = takeInput() ;
        printLevelWise(root);
        System.out.println(containElementXRecur(root, x)) ;
    }

    private static boolean containElementX(TreeNode<Integer> root, int x) {
        if (root == null) {
            return false ;
        }
        if (root.data == x) {
            return true ;
        }
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (pendingNodes.size() != 0) {
            for (int i = 0; i < pendingNodes.peek().children.size(); i++) {
                if (pendingNodes.peek().children.get(i).data == x) {
                    return true;
                }
                pendingNodes.add(pendingNodes.peek().children.get(i));
            }
            pendingNodes.poll();
        }
        return false ;
    }
    private static boolean containElementXRecur(TreeNode<Integer> root, int x) {
        if (root == null) {
            return false ;
        }
        if (root.data == x) {
            return true ;
        }
        boolean ans = false;
        for (int i = 0 ; i < root.children.size() ; i++) {
            ans = ans || (containElementXRecur(root.children.get(i) , x));
        }
        return ans ;
    }
}
