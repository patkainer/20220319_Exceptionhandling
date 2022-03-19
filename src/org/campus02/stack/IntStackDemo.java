package org.campus02.stack;

public class IntStackDemo {
    public static void main(String[] args) {
        IntStack stack = new IntStack(2);
        System.out.println("push = " + 1);
        stack.push(1);
        System.out.println("stack = " + stack);

        int pop = stack.pop();
        System.out.println("pop = " + pop);
        System.out.println("stack = " + stack);

        System.out.println("push = " + 2);
        stack.push(2);
        System.out.println("stack = " + stack);
        try{
            stack.pop();
            System.out.println(stack);
            stack.pop();

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
