import java.util.Stack;

public class MakingStringGreat {
    public String makeGood(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek() - ch)==32){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        char[] result = new char[st.size()];
        int i = st.size() - 1;
        while(!st.isEmpty()){
            result[i]=st.pop();
            i--;
        }
        return new String(result);
    }
}
