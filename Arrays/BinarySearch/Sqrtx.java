package Arrays.BinarySearch;

public class Sqrtx {
    public int mySqrt(int num){
        if( num < 2){
            return num;
        }
        int left = 1;
        int right = num/2;
        int ans = 1;
        while(left <= right){
            int mid= left + (right - left)/2;
            long sq = (long) mid* mid;
            if(sq == num){
                return mid;
            }else if(sq < num){
                ans =mid;
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
