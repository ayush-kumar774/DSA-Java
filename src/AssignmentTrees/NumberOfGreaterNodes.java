package AssignmentTrees;
import Trees.TreeNode;

import java.util.Scanner;
import static Trees.LevelWiseInput.printLevelWise;
import static Trees.LevelWiseInput.takeInput;

public class NumberOfGreaterNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() ;
        TreeNode<Integer> root = takeInput() ;
        printLevelWise(root);
        System.out.println(numberOfGreaterNodes(root, x));
    }

    private static int numberOfGreaterNodes(TreeNode<Integer> root, int x) {
        if (root == null) {
            return 0 ;
        }
        int ans = 0 ;
        if (root.data > x) {
            return  1 ;
        }
        for (int i = 0 ; i < root.children.size(); i++)
        {
            ans += numberOfGreaterNodes(root.children.get(i), x);
        }
        return ans;
    }
}
