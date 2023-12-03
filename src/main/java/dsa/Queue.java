package dsa;

public class Queue {
    int capacity=5;
    int queue[]=new int[capacity];
    int front;
    int rear;
    int size;
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else {
            queue[rear] = data;
            rear = (rear + 1) % capacity;
            size = size + 1;
        }
    }

    private boolean isFull() {
        return size==capacity;
    }
    private boolean isEmpty() {
        return size<=0;
    }
    public int deQueue(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            queue[front]=data;
            front=(front+1)%capacity;
            size=size-1;

        }
        return data;
    }

    public void show(){
        for(int i=front;i<capacity;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
