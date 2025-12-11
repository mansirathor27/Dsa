package Arrays.SlidingWindow;
import java.util.*;
public class MaximumErasureValue {
    public int maximumUniqueSubarraySum(int[] nums){
        Set<Integer> window = new HashSet<>();
        int left = 0;
        int sum = 0;
        int maxSum =0;
        for(int right = 0; right< nums.length; right++){
            while(window.contains(nums[right])){
                window.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            window.add(nums[right]);
            sum += nums[right];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
