package assignment2;

/*
Remove a loop/cycle in LinkedList.
*/
public class RemoveCycle {
    public static class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public boolean isCycle(){ // Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // Cycle exists
            }
        }
        return false; // Cycle doesn't exist
    }
    public void removeCycle(){
        // Step-1: detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return;
        }
        // Step-2: find meeting point
        slow = head;
        Node prev = null; // last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Step-3: remove cycle -> last.next = null
        if (prev != null) {
            prev.next = null;
        }
    }

    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();
        head = new Node(1);
        Node tempNode = new Node(2);
        head.next = tempNode;
        head.next.next = new Node(3);
        head.next.next.next = tempNode; // circular LL
        System.out.println(ll.isCycle());
        ll.removeCycle();
        System.out.println(ll.isCycle());
    }
}
