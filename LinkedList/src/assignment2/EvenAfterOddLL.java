package assignment2;

import java.util.Scanner;

/*
Problem Statement: Even after Odd LinkedList
Problem Level: MEDIUM
Problem Description:
For a given singly linked list of integers,
arrange the elements such that all the even numbers are placed after the odd numbers.
The relative order of the odd and even terms should remain unchanged.
Note :
No need to print the list, it has already been taken care.
Only return the new head to the list.

Input format:
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.
The first line of each test case or query contains the elements of the singly linked list separated by a single space.

Remember/Consider :
While specifying the list elements for input,
-1 indicates the end of the singly linked list and hence, would never be a list element

Output format:
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec

Sample Input 1 :
1
1 4 5 2 -1

Sample Output 1 :
1 5 4 2

Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1

Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40
 */
public class EvenAfterOddLL {
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

    public void add(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node evenAfterOdd(Node head){
        if(head == null){
            return head;
        }
        Node evenHead = null,oddHead = null,evenTail = null,oddTail = null;
        while(head != null){
            if(head.data % 2 == 0){
                if(evenHead == null){
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }else{
                if(oddHead == null){
                    oddHead = head;
                    oddTail = head;
                }else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if(oddHead == null){
            return evenHead;
        } else{
            oddTail.next = evenHead;
        }
        if(evenHead != null){
            evenTail.next = null;
        }
        return oddHead;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenAfterOddLL ll = new EvenAfterOddLL();
        int a = sc.nextInt();
        while(a != -1){
            ll.add(a);
            a = sc.nextInt();
        }
        ll.print();
        head = evenAfterOdd(head);
        ll.print();
    }
}
