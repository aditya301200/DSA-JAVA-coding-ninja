package problems;

import java.util.Arrays;
import java.util.Scanner;

/*
Problem Statement: Problem discussion
Problem Level: EASY
Problem Description:
Harshit gave Aahad an array of size N and asked to minimize the difference between
the maximum value and minimum value by modifying the array under the condition
that each array element either increase or decrease by k(only once).
It seems difficult for Aahad so he asked for your help
Input Format
The First line contains two space-separated integers: N,K
Next lines contain N space-separated integers denoting elements of the array

Output Format
The output contains a single integer denoting the minimum difference between maximum value and
the minimum value in the array

Constraints
1 =< N <= 10^5
1 <= Ai,K <= 10^9

Sample Input 1 :
3 6
1 15 10
Sample Output 1:
5
Explanation For Sample Input 1 :
Arrays that can be obtained by either increasing or decreasing each element by k are

[-5 9 4]   difference between maximum and minimum is 16

[-5 9 16] difference between maximum and minimum is 21

[-5 21 16] difference between maximum and minimum is 26

[-5 21 4] difference between maximum and minimum is 26

[7 9 4]   difference between maximum and minimum is 5

[7 9 16] difference between maximum and minimum is 9

[7 21 16] difference between maximum and minimum is 14

[7 21 4] difference between maximum and minimum is 17

So the minimum of all differences between maximum and minimum elements is 5.
So, we need to return 5.

Sample Input 2 :
3 2
1 2 3
Sample Output 2:
2

 */
public class MinimizeDifference {
    private static int findDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int min = arr[0];
        int max = arr[n-1];
        for(int i=0; i<n; i++) {
            if(arr[i]-k<0) {
                continue;
            }
            min = Math.min(arr[0]+k, arr[i]-k);
            max = Math.max(arr[i-1]+k, arr[n-1]-k);
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDiff(arr, n, k));
    }
}
