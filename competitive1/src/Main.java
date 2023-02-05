import dataStructures.*;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ///////////
        //STACKS///
        ///////////

        MyStack<String> stringStack = new MyStack<>();
        stringStack.add("Test1");
        stringStack.add("Test2");
        stringStack.add("Test3");
        stringStack.add("Test4");
        stringStack.add("Test5");

        System.out.println(stringStack.toString());

        System.out.println();

        stringStack.removeFirst();
        stringStack.pop();

        System.out.println(stringStack.toString());

        stringStack.search("Test5");
        stringStack.search("Test6");

        MyStack<Integer> integerMyStack = new MyStack<>();
        System.out.println(integerMyStack.DecimalToBinary(300));

        BinaryTree binaryTree = new BinaryTree();




    }
}