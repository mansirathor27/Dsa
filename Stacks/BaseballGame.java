package Stacks;
import java.util.*;
public class BaseballGame {
    public int calPoints(String[] operations){
        Stack<Integer> st = new Stack<>();
        for(String op: operations){
            if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                st.push(st.peek());
            }else if(op.equals("+")){
                int val = st.pop();
                int newVal = val + st.peek();
                st.push(val);
                st.push(newVal);
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum =0;
        for(int x : st){
            sum += x;
        }
        return sum;
    }
}
