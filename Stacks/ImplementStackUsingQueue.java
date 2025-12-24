import java.util.*;
public class ImplementStackUsingQueue {
    Queue<Integer> q;
    public ImplementStackUsingQueue(){
        q = new LinkedList<>();
    }
    public void push(int x){
        q.add(x);
        for(int i=0; i< q.size() -1; i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        return q.remove();
    }
    public int peek(){
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();
    }
}
