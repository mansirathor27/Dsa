package Arrays.SlidingWindow;

public class MaxConsecutiveOnes3 {
    public int findMaxConsecutiveOnes(int[] nums, int k){
        int left = 0;
        int maxLen = 0;
        int zeroes =0;
        for(int right = 0; right< nums.length ; right++){
            if(nums[right]==0){
                zeroes++;
            }
            while(zeroes > k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;

    }
}
