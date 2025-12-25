import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStacks(int[] pushed, int[] popped){
        Stack<Integer> st = new Stack<>();
        int j =0;
        for(int x: pushed){
            st.push(x);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}
