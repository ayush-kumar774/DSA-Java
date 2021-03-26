package AssignmentTrees;
import Trees.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import static Trees.LevelWiseInput.printLevelWise;
import static Trees.LevelWiseInput.takeInput;

public class NodeWithMaximumSum {
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput() ;
        printLevelWise(root);
        System.out.println("Node with maximum sum is " + nodeWithMaximumSum(root));
    }

    private static int nodeWithMaximumSum(TreeNode<Integer> root) {
        if (root == null)
        {
            return 0 ;
        }
        HashMap<Integer , Integer> mp = new HashMap<>();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root) ;
        int sum ;
        while(pendingNodes.size() != 0)
        {
            sum = 0 ;
            sum += pendingNodes.peek().data ;
            for(int i = 0 ; i < pendingNodes.peek().children.size() ; i++)
            {
                sum += pendingNodes.peek().children.get(i).data ;
                pendingNodes.add(pendingNodes.peek().children.get(i)) ;
            }
            mp.put(pendingNodes.peek().data, sum);
            pendingNodes.poll() ;
        }
        int max = 0 ;
        int res = 0 ;
        for (Integer s : mp.values()) {
            if (max < s) {
                max = s ;
            }
        }
        for (Integer s : mp.keySet()) {
            if (max == mp.get(s)) {
                res = s ;
            }
        }
        System.out.println("The maximum sum is " + max);
        return res;
    }
}
