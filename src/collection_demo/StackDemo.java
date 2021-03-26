package collection_demo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        //LIFO
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println(stack.peek());
        System.out.println(stack.pop());

        stack.forEach(s->{
            System.out.println(s);
        });
    }
}
