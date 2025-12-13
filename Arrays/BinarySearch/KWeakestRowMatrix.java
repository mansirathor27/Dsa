package Arrays.BinarySearch;
import java.util.*;

public class KWeakestRowMatrix {
    private int countSoldiers(int[] row){
        int left = 0;
        int right = row.length -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(row[mid]==1){
                left = mid+1;
            }else{
                right = mid -1 ;
            }
        }
        return left;
    }
    public int[] kWeakestRowMatrix(int[][] mat, int k){
        int m = mat.length;
        int[][] arr = new int[m][2];
        for(int i =0; i< m; i++){
            arr[i][0] = countSoldiers(mat[i]);
            arr[i][1]=i;
        }

        Arrays.sort(arr, (a, b )->{
            if(a[0] != b[0])    return a[0] - b[0];
            return a[1] - b[1];
        });

        int[] ans = new int[k];
        for(int i =0; i< k; i++){
            ans[i]= arr[i][1];
        }
        return ans;
    }
}
