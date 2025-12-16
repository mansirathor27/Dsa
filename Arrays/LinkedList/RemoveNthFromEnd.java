package Arrays.LinkedList;

class Node{
    int val;
    Node next;
    Node(){};
    Node(int val){
        this.val = val;
    }
    Node(int val, Node next){
        this.val= val;
        this.next = next;
    }
}
public class RemoveNthFromEnd {
    public Node removeNthFromEnd(Node head, int n){
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;
        for(int i=0; i<=n ; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
