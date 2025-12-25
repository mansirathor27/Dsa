import java.util.Stack;

public class ScoreOfParantheses{
    public int score(String s){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }else{
                int inner = st.pop();
                int outer = st.pop();
                int score = outer + Math.max(1, 2*inner);
                st.push(score);
            }
        }
        return st.pop();
    }
}