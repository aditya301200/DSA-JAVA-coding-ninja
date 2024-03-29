package assignment_advanced;
/*
Problem Statement: Check Array Rotation
Problem Level: EASY
Problem Description:
You have been given an integer array/list(ARR) of size N.
It has been sorted(in increasing order) and then rotated by some number 'K' in the clockwise direction.
Your task is to write a function that returns the value of 'K', that means,
the index from which the array/list has been rotated.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format :
For each test case, print the value of 'K' or the index from which which the array/list has been rotated.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec

Sample Input 1:
1
6
5 6 1 2 3 4

Sample Output 1:
2

Sample Input 2:
2
5
3 6 8 9 10
4
10 20 30 1

Sample Output 2:
0
3
 */
import java.util.*;
public class CheckRotation {
    private static int searchPivot(int[] arr,int n) {
        int start = 0;
        int end = n-1;
        while(start<=end) {
            // if first element is mid or last element is mid
            // then simply use modulo so it never goes out of bound.
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
            if(arr[mid]<arr[next] && arr[mid]<arr[prev]) {
                return mid;
            } else {
                if(arr[mid]<arr[end]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        int ans = searchPivot(arr, n);
        System.out.println(ans);
    }
}
