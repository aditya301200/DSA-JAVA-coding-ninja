package assignment;

import java.util.Scanner;

/*
AppendLastNToFirst

You have been given a singly linked list of integers along with an integer 'N'.
Write a function to append the last 'N' nodes towards the front of the singly linked list
and returns the new head to the list.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.
The first line of each test case contains length of the LinkedList
The second line of each test case or query contains the elements of the singly linked list separated by a single space.
The third line contains the integer value 'N'.
It denotes the number of nodes to be moved from last to the front of the singly linked list.

Output format :
For each test case/query, print the resulting singly linked list of integers in a row,
separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
0 <= N < M
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
2
5
1 2 3 4 5
3
6
10 20 30 40 50 60
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
Sample Input 2 :
1
7
10 6 77 90 61 67 100
4
Sample Output 2 :
90 61 67 100 10 6 77
 Explanation to Sample Input 2 :
We have been required to move the last 4 nodes to the front of the list. Here,
"90->61->67->100" is the list which represents the last 4 nodes.
When we move this list to the front then the remaining part of the initial list which is,
"10->6->77" is attached after 100. Hence, the new list formed with an updated head pointing to 90.
 */
public class rotateLL {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void print(Node head){
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

    public int length(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public Node rotate(Node head,int n, int k){
        if(head == null){
            return head;
        }
        Node curNode = head;
        int cnt = 1;
        while(cnt != n-k){
            curNode = curNode.next;
            cnt++;
        }
//        System.out.println("curNode: "+curNode.data);
        if(curNode.next == null){
            return head;
        }
        Node temp = curNode;
//        System.out.println("temp: "+temp.data);
        while(curNode.next != null){
            curNode = curNode.next;
        }
//        System.out.println("curNode: "+curNode.data);
        curNode.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;

            for(int i=0; i<n-1; i++){
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            int k = sc.nextInt();
            rotateLL ll = new rotateLL();
            head = ll.rotate(head, n ,k);
            ll.print(head);
        }
    }
}
