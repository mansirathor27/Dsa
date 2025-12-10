package Arrays.SlidingWindow;

public class MinimumRecolors {
    public int minimumRecolors(String nums, int k){
        int whites =0;
        for(int left =0; left<k; left++){
            if(nums.charAt(left)=='W'){
                whites++;
            }
        }
        int minWhites = whites;
        for(int right =k; right < nums.length(); right++){
            if(nums.charAt(right) == 'K'){
                whites++;
            }
            if(nums.charAt(right-k) == 'W'){
                whites--;
            }
            minWhites = Math.min(minWhites, whites);
        }
        return minWhites;
    }
}
