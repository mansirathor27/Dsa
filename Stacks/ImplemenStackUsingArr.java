package Stacks;

public class ImplemenStackUsingArr {
    int[] stack;
    int top;
    int size;
    ImplemenStackUsingArr(int size){
        this.size = size;
        stack = new int[size];
        top= -1;
    }
    void push(int x){
        if(top == size -1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = x;
    }
    int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        int val = stack[top];
        top--;
        return val;
    }
    int peek(){
        if(top == -1){
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top == -1;
    }
    void printStack(){
        if(top ==-1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack (top -> bottom");
        for(int i=top; i>=0; i--){
            System.out.println(stack[i] + "");
        }
        System.out.println();
    }
}

