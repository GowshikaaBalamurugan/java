package dsa;

public class DStack {

    int capacity=5;
    int stack[] = new int[capacity];
    int top = -1;

    public void push(int data) {
        if (size() >= capacity) {
            expand();
        }
            stack[++top]=data;
    }
    public void expand(){
    capacity=capacity*2;
    int newStack[]=new int[capacity];
    System.arraycopy(stack,0,newStack,0,size());
    stack=newStack;
}
    private int size() {
        return top+1;
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
            shrink();
            top--;
        }
        return data;
    }
    public void shrink(){
        if(size()<=(capacity/2)/2){
            capacity/=2;
            int newStack[]=new int[capacity];
            System.arraycopy(stack,0,newStack,0,size());
            stack=newStack;
        }
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