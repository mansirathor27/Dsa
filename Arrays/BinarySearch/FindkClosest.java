package Arrays.BinarySearch;

public class FindkClosest {
    public int findKClosest(int[] arr, int k, int x){
        int left =0;
        int right = arr.length -k;
        while(left < right){
            int mid = left + (right - left)/2;
            if(x - arr [mid] > arr[mid + k] - x){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
