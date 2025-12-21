package Stacks;

public class Main {
    public static void main(String[] args) {
        ImplemenStackUsingArr st = new ImplemenStackUsingArr(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.printStack();
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        st.printStack();
    }
}
