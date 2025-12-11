package Arrays.SlidingWindow;

public class MaxNoOfVowelsInSubstring {
    public int maxVowels(String s, int k){
        int maxCount =0;
        int count = 0;
        boolean[] vowels = new boolean[128];
        vowels['a'] = vowels['e'] = vowels['i'] = vowels['o'] = vowels['u'] = true;
        for(int i =0; i<k; i++){
            if(vowels[s.charAt(i)]){
                count++;
            }
        } 
        maxCount = count;
        for(int right =k ; right< s.length(); right++){
            if(vowels[s.charAt(right)]){
                count++;
            }
            if(vowels[s.charAt(right - k)]){
                count--;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
