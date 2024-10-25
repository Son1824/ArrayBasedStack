package StackDemo.ArrayBasedStack;

public class ArrayBasedStack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayBasedStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
