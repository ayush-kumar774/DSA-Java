package BinaryTree;

public class BinaryTreeNode<T> {
    public BinaryTreeNode<T> left ;
    public BinaryTreeNode<T> right ;
    public T data ;

    BinaryTreeNode(T data) {
        this.data = data ;
        left = right = null;
    }
}
