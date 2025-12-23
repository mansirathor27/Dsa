import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures){
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int prevIdx = st.pop();
                result[i] = i - prevIdx;
            }
            st.push(i);
        }
        return result;
    }
}
