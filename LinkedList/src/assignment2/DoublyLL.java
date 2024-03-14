package assignment2;

public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int d){
            data = d;
            next = null;
            prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //* add
    public void addFirst(int n){
        Node newNode = new Node(n);
        if(head == null){ // if list is empty
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int n){
        Node newNode = new Node(n);
        if(head==null){
            head = tail = null;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    //* remove
    public int removeFirst(){
        int val = head.data;
        head = head.next;
        head.prev = null;
//        val = head.data;
        return val;
    }
    public int removeLast(){
        Node temp = head;
        int val = temp.data;
        Node lastNode = temp;
        while(temp.next.next != null){
            temp = temp.next;
        }
        lastNode = temp.next;
        lastNode.prev = null;
        temp.next = null;
        val = lastNode.data;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addLast(1);
        dll.addLast(4);
        dll.print();
        dll.reverse();
        dll.print();
        System.out.println(dll.removeFirst());
        dll.print();
        System.out.println(dll.removeLast());
        dll.print();
    }
}
