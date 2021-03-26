package Trees;
import java.util.Scanner;

public class Tree {

    public static TreeNode<Integer> takeInput() {
        Scanner sc  = new Scanner(System.in) ;
        System.out.println("Enter next node data ");
        int n = sc.nextInt() ;
        TreeNode<Integer> root = new TreeNode<>(n) ;
        System.out.println("Enter number of children for " + n);
        int childCount = sc.nextInt() ;
        for (int i = 0 ; i < childCount ; i++) {
            TreeNode<Integer> child = takeInput() ;
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root)
    {
        String s = root.data + " : " ;
        for (int  i = 0 ; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + "," ;
        }
        System.out.println(s);
        for (int  i = 0 ; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takeInput() ;
        print(root);
//        TreeNode<Integer> root  = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//
//        System.out.println(root);
    }
}
