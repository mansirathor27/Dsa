import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums2){
            while(!st.isEmpty() && st.peek()< num){
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        while(!st.isEmpty()){
            map.put(st.pop(), -1);
        }

        int[] result = new int[nums1.length];
        for(int i=0; i< nums1.length ; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
