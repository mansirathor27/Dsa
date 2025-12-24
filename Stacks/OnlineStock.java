import java.util.Stack;

public class OnlineStock {
    Stack<int[]> stack ;
    public OnlineStock(){
        stack = new Stack<>();
    }
    public int next(int price){
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.peek()[1];
            stack.pop();
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
