package Queues;

public class DesignCircularQueue {
    int[] arr;
    int front, rear, size;
    public DesignCircularQueue(int k){
        size = k;
        arr = new int[k];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return (front == (rear+1) % size);
    }
    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = rear =0;
        }else{
            rear = (rear + 1)%size;
        }
        arr[rear] = value;
        return true;
    }
    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front+1)%size;
        }
        return true;
    }
    public int front(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    public int rear(){
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
}
