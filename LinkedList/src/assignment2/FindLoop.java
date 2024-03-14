package assignment2;

import java.util.Scanner;

/*
Detect a loop/cycle in LinkedList using Floyd's Cycle Finding Algorithm.
*/
public class FindLoop {
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
    public static void main(String[] args) {
        FindLoop ll = new FindLoop();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // circular LL
        System.out.println(ll.isCycle());
    }
}
