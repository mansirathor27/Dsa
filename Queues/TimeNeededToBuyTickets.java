package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {
    public int timeToBuy(int[] tickets, int k){
        Queue<int[]> q = new LinkedList<>();
        for(int i =0; i<tickets.length; i++){
            q.add(new int[]{i, tickets[i]});
        }
        int time = 0;
        while(true){
            int[] person = q.remove();
            time++;
            person[1]--;
            if(person[0] ==k && person[1] ==0){
                return time;
            }
            if(person[1] > 0){
                q.add(person);
            }
        }
    }
}
