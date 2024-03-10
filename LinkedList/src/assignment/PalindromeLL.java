package assignment;

import java.util.Scanner;

/*
Palindrome LinkedList

You have been given a head to a singly linked list of integers.
Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.

First and the only line of each test case or query contains the elements of the singly linked list separated by a single space.

 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
6
9 2 3 3 2 9
Sample Output 1 :
true
Sample Input 2 :
2
5
0 2 3 2 5

Sample Output 2 :
false
true
Explanation for the Sample Input 2 :
For the first query, it is pretty intuitive that the     given list is not a palindrome, hence the output is 'false'.

For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.
 */
public class PalindromeLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    /*public static boolean isPalindrome(Node head, int n){
        if(n%2!=0){

        }
    }*/

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
            PalindromeLL ll = new PalindromeLL();
        }
    }
}
