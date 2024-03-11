package assignment;

import java.util.Scanner;

public class RemoveNthNode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
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
        while (temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void remove(int n, int k){
        if(n==k){
            head = head.next;
            return;
        }
        int i=1;
        int iToFind = n-k;
        Node curr = head;
        while(i<iToFind){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return;
    }

    public static void main(String[] args) {
        RemoveNthNode ll = new RemoveNthNode();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        head = new Node(a);
        tail = head;
        for(int i=0; i<n-1; i++){
            a = sc.nextInt();
            tail.next = new Node(a);
            tail = tail.next;
        }
        ll.remove(n,5);
        ll.print();
    }
}
