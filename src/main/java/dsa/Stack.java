package dsa;

public class Stack {
    int stack[] = new int[5];
    int top = -1;

    public void push(int data) {
        if (size() == top + 1) {
            System.out.println("Stack overflow..");
        } else {
            stack[++top] = data;
        }
    }

    private int size() {
        return stack.length;
    }
    private boolean isEmpty(){
        return top<0;
    }
    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            data=stack[top];
            stack[top] = 0;
            top--;
        }
        return data;
    }

    public int peek(){
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            data=stack[top];
        }
        return data;
    }

    public void show(){
        for(int i=0;i<size();i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}