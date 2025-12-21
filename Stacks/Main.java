package Stacks;

public class Main {
    public static void main(String[] args) {
        ImplemenStackUsingArr st = new ImplemenStackUsingArr(5);
        ImplementStackUsingLL str = new ImplementStackUsingLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.printStack();
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        st.printStack();



        str.push(1);
        str.push(2);
        str.push(3);
        str.push(4);
        str.push(5);
        str.printStackLL();
        System.out.println(str.pop());
        System.out.println(str.peek());
        str.printStackLL();

    }
}
