package testThree;

import java.util.*;

/*
Problem Statement: Find Leaders in array
Problem Level: EASY
Problem Description:
Given an integer array A of size n. Find and print all the leaders present in the input array.
An array element A[i] is called Leader, if all the elements following it
(i.e. present at its right) are less than or equal to A[i].
Print all the leader elements separated by space and in the reverse order.
That means whichever leader comes at last should be printed first.
Input Format :
Line 1 : Integer n, size of array
Line 2 : Array A elements (separated by space)

Output Format :
 leaders of array (separated by space)

Constraints :
1 <= n <= 10^6

Sample Input 1 :
6
3 12 34 2 0 -1

Sample Output 1 :
-1 0 2 34

Sample Input 2 :
5
13 17 5 4 6

Sample Output 2 :
6 17
 */
public class LeadersInArray {
    /*
     * Step 1. Create a function ‘getResult()’ that will accept the 2 parameters, the first one is the input array, and the second one is the size of that array.
     * Step 2. Initialize a variable ‘max_till’ with the rightmost element of the array.
     * Step 3. Make an iteration using the ‘for’ loop with variable ‘i’ from the second last element of the array to the first element of the array.
     * Step 4. Change the value of ‘max_till’ if the value of the ith element of the array is greater than ‘max_till’.
     * Step 5. Print the value of ‘max_till’
     */
    private static void findLeaders(int[] arr, int n) {
        int max_till = arr[n-1];
        System.out.print(max_till+" ");
        int k = 1;
        for(int i=n-2; i>=0; i--) {
            if(max_till < arr[i]) {
                max_till = arr[i];
                System.out.print(max_till+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        findLeaders(arr, n);
    }
} // T.C. = O(n)
