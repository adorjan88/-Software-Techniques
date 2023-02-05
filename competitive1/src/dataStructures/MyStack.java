package dataStructures;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T> {

    private final ArrayList<T> myStack;

    public MyStack() {
        myStack = new ArrayList<>();
    }

    public void add(T element){
        myStack.add(element);
    }

    public int length(){
        return myStack.size();
    }

    public T get(int i){
        return myStack.get(i);
    }

    public void removeFirst(){
        if(myStack.size()==0)
            throw new EmptyStackException();
        else
            myStack.remove(myStack.get(0));
    }

    //pushing "front" but we are actually pushing back to the bottom of the stack, to avoid reversing the stack for the binary converter
    public void push_front(T element){
        myStack.add(0,element);
    }
    public void pop(){
        if(myStack.size()==0)
            throw new EmptyStackException();
        else
            myStack.remove(myStack.size()-1);
    }
    public boolean search(T element){
        return myStack.contains(element);
    }

    public T peek() {
        if (myStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return myStack.get(myStack.size() - 1);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "myStack=" + myStack +
                '}';
    }

    //convert to binary using stacks
    public String DecimalToBinary(int x){
        Integer y;
        while(x > 0){
            y = x%2;
            x/=2;
            this.push_front((T)y);
        }

        return myStack.toString();
    }



}
