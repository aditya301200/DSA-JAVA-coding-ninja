package testThree;
/*
Problem Statement: Maximise the sum
Problem Level: MEDIUM
Problem Description:
Given 2 sorted arrays (in increasing order), find a path through the intersections
that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces

Output Format :
Maximum sum value

Constraints :
1 <= M, N <= 10^6

Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15

Sample Output :
81

Explanation :
We start from array 2 and take sum till 5 (sum = 11).
Then we'll switch to array at element 10 and take till 15. So sum = 36.
Now, no elements left in array after 15, so we'll continue in array 1.
Hence sum is 81
 */
import java.util.*;
public class MaximiseSum {
    private static int result(int[] arr1, int[] arr2, int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        int res = 0;
        int i = 0;
        int j = 0;
        while(i<n && j<m) {
            if(arr1[i] < arr2[j]) {
                sum1 += arr1[i];
                i++;
            }
            else if(arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            } else { // When both elements are equal, take the maximum sum and reset sum1 and sum2
                res += Math.max(sum1, sum2) + arr1[i]; // or arr2[j], as both are equal
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        // Add remaining elements of array 1, if any
        while(i<n) {
            sum1 += arr1[i];
            i++;
        }
        // Add remaining elements of array 2, if any
        while(j<m) {
            sum2 += arr2[j];
            j++;
        }
        // Add the remaining sum
        res += Math.max(sum1, sum2);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(result(arr1, arr2, n, m));
    }
}
