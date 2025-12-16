package Arrays.LinkedList;

class Node{
    int val;
    Node next;
    Node() {

    };
    Node (int val){
        this.val = val;
    }
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
public class LinkedListCycle {
    public boolean hasCycle(Node head){
        if(head ==  null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
