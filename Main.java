package StackDemo.ArrayBasedStack;

import StackDemo.ArrayBasedStack.ArrayBasedStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array-Based Stack:");
        ArrayBasedStack arrayStack = new ArrayBasedStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println("Top element (peek): " + arrayStack.peek());
        System.out.println("Popped element: " + arrayStack.pop());
        System.out.println("Is stack empty? " + arrayStack.isEmpty());
    }
}
