package assignment_advanced;
/*
Problem Statement: Merge Two Sorted Arrays
Problem Level: MEDIUM
Problem Description:
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
merge them into a third array/list such that the third array is also sorted.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.

Output Format :
For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec

Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13

Sample Output 1 :
1 2 3 4 4 6 7 11 13

Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0

Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90
 */
import java.util.*;
public class MergeSortedArrays {
    private static ArrayList<Integer> mergeArr(int[] arr1, int[] arr2, int n, int m){
        int i=0;
        int j=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i<n && j<m) {
            if(arr1[i]==arr2[j]) {
                arr.add(arr1[i]);
                arr.add(arr2[j]);
                i++;
                j++;
            } else if(arr1[i]<arr2[j]) {
                arr.add(arr1[i]);
                i++;
            } else {
                arr.add(arr2[j]);
                j++;
            }
        }
        while(i<n) {
            arr.add(arr1[i]);
            i++;
        }
        while(j<m) {
            arr.add(arr2[j]);
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) {
            arr2[i]= sc.nextInt();
        }
        System.out.println(mergeArr(arr1,arr2,n,m));
    }
}
