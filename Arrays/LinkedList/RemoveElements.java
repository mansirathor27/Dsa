package Arrays.LinkedList;


class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val = val;
    }
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
public class RemoveElements {
    public Node removeElements(Node head, int val){
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}
