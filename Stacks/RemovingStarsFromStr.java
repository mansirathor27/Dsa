import java.util.Stack;

public class RemovingStarsFromStr {
    public String removeStars(String s){
        Stack<Character> st = new Stack<>();
        for( char ch : s.toCharArray()){
            if(ch != '*'){
                st.push(ch);
            }else if(!st.isEmpty()){
                st.pop();
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