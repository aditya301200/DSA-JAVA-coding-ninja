package assignment;

import java.util.Scanner;

/*
Print Reverse LinkedList

You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
To explain it further, you need to start printing the data from the tail and move towards the head of the list,
printing the head data at the end.
Note :
You can’t change any of the pointers in the linked list, just print it in the reverse order.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Constraints :
While specifying the list elements for input, -1 indicates the end of the singly linked list
and hence, would never be a list element.
Output format :
For each test case, print the singly linked list of integers in a reverse fashion, in a row, separated by a single space.

Output for every test case will be printed in a separate line.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^3
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
5
1 2 3 4 5
Sample Output 1 :
5 4 3 2 1
Sample Input 2 :
2
3
1 2 3
5
10 20 30 40 50
Sample Output 2 :
3 2 1
50 40 30 20 10
 */
public class ReverseLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head, Node tail){ // iterative way
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static void reverseRecursive(Node head){ // recursive way
        if(head == null){
            return;
        }
        reverseRecursive(head.next);
        System.out.print(head.data+" ");
    }

    public static void print(Node head){
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            for(int i=0; i< n-1; i++){
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            ReverseLL ll = new ReverseLL();
            head = reverse(head,tail);
            print(head);
        }
    }
}
