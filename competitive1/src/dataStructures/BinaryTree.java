package dataStructures;

public class BinaryTree<T> {

    Node<T> root;
    public static class Node<T>{

        T data;
        Node<T> right;
        Node<T> left;

        public Node(T data){
            this.data = data;
        }


    }
}
