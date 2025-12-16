package Arrays.LinkedList;


class Node{
    int val;
    Node next;
    Node(){};
    Node(int val){
        this.val = val;
    }
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
public class BinaryNumberToInteger {
    public int getDecimalNumber(Node head){
        int result = 0 ;
        while(head != null){
            result = result *2 + head.val;
            head = head.next;
        }
        return result;
    }
}
