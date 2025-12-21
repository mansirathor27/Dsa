package Stacks;

public class ImplementStackUsingLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node top;
    void push(int x){
        Node newNode= new Node(x);
        newNode.next = top;
        top = newNode;
    }
    int pop(){
        if(top == null){
            System.out.println("Stack underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
        
    }
    int peek(){
        if(top == null) return -1;
        return top.data;
    }
    boolean isEmpty(){
        return top == null;
    }
    void printStackLL(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp= top;
        while(temp != null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();
    }
}
