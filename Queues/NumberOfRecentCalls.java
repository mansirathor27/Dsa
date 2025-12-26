package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    Queue<Integer> q;
    NumberOfRecentCalls(){
        q = new LinkedList<>();
    }
    public int ping(int t){
        q.add(t);
        while(q.peek() < t -3000){
            q.remove();
        }
        return q.size();
    }
}
