package assignment;
import java.util.Scanner;

/*
Eliminate duplicates from LL

You have been given a singly linked list of integers where the elements are sorted in ascending order.
Write a function that removes the consecutive duplicate values such that
the given list only contains unique elements and returns the head to the updated list.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.

The first and the only line of each test case or query contains the elements(in ascending order)
of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence,
would never be a list element.
 Output format :
For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
10
1 2 3 3 4 4 5 5 5 7
Sample Output 1 :
1 2 3 4 5 7
Sample Input 2 :
2
5
10 20 30 40 50
4
10 10 10 10
Sample Output 2 :
10 20 30 40 50
10
 */
public class RemoveDuplicates {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node removeDup(Node head){
        Node curr = head;
        Node temp = head.next;

        while(temp != null){
            if(temp.data == curr.data ){
                temp = temp.next;
                continue;
            }
            curr.next = temp;
            curr = temp;
            temp = curr.next;

        }
        curr.next = null;
        return head;
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
            RemoveDuplicates ll = new RemoveDuplicates();
            ll.removeDup(head);
            ll.print(head);
        }
    }
}