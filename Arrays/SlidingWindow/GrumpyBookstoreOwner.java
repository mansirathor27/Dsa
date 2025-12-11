package Arrays.SlidingWindow;

public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int X){
        int n = customers.length;
        int satisfied = 0;
        for(int i=0; i<n ; i++){
            if(grumpy[i]==0){
                satisfied += customers[i];
            }
        }
        int extra =0, maxExtra =0;
        for(int i=0; i<X;i++){
            if(grumpy[i]==1){
                extra+= customers[i];
            }
        }
        maxExtra = extra;
        for(int i=X; i< n; i++){
            if(grumpy[i]==1){
                extra+= customers[i];
            }
            if(grumpy[i-X]==1){
                extra -= customers[i-X];
            }
            maxExtra = Math.max(maxExtra, extra);
        }
        return satisfied + maxExtra;
    }
}
