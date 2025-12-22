package Stacks;
import java.util.*;

public class RemoveAdjDuplicates{
    public String removeDuplicates(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        char[] result = new char[st.size()];
        int i = st.size() -1;
        while(!st.isEmpty()){
            result[i] = st.pop();
            i--;
        }
        return new String(result);
    }
}