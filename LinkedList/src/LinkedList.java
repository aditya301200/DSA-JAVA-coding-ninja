public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // step-1: create a new Node
        Node newNode = new Node(data);

        if(head == null){ // if list is empty
            head = tail = newNode;
            return;
        }

        //step-2: newNode next = head
        newNode.next = head;

        //step-3: head = newNode
        head = newNode;
    } // T.C. = O(1)

    public void addLast(int data){
        // step-1: create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step-2: tail next = new Node
        tail.next = newNode;

        // step-3: tail = new Node
        tail = newNode;
    } // T.C. = O(1)

    public void addMiddle(int pos, int data){
        if(pos == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < pos-1){
            temp = temp.next;
            i++;
        }

        // i==pos-1 i.e. temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    } // T.C. = O(N)

    public int removeFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeLast(){
        int val = head.data;
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            head = tail = null;
            return val;
        }
        Node prev = head;
        while(prev.next.next != null){
            prev = prev.next;
        }
        val = prev.next.data;
        prev.next = null;
        return val;
    }

    public int length(){
        Node temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

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
    } // T.C. = O(N)

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addMiddle(2,20);
        ll.print();
        System.out.println(ll.length());
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.removeLast());
        ll.print();
    }
}
