import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public int[] nextGreater(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(result,-1);
        for(int i =0; i< 2*n; i++){
            int index = i%n;
            while(!st.isEmpty() && nums[st.peek()] < nums[index]) {
                result[st.pop()] = nums[index];
            }
            if(i<n){
                st.push(index);
            }
        }
        return result;
    }
}
