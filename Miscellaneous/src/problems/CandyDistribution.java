package problems;

import java.util.Scanner;

/*
Problem Statement: Distribute Candies
Problem Level: MEDIUM
Problem Description:
Shaky has N (1<=N<=50000) candy boxes each of them contains a non-zero number of candies
(between 1 and 1000000000). Shaky want to distribute these candies among his K (1<=K<=1000000000)
IIIT-Delhi students. He want to distribute them in a way such that:
1. All students get equal number of candies.
2. All the candies which a student get must be from a single box only.
As he want to make all of them happy so he want to give as many candies as possible.
Help Shaky in finding out what is the  maximum number of candies which a student can get.
Input
First line contains 1<=T<=20 the number of test cases. Then T test cases follow.
First line of each test case contains N and K. Next line contains N integers,
i-th of which is the number of candies in ith box.

Output
For each test case print the required answer in a separate line.

Sample Input:
2
3 2
3 1 4
4 1
3 2 3 9

Sample Output:
4
9
 */
public class CandyDistribution {
    private static int result(int[] arr,int n, int k) {
        int maxCandies = 0;
        for(int i=0; i<n ;i++) {
            if(arr[i]>maxCandies && arr[i]%k==0) {
                maxCandies = arr[i];
            }
        }
        return maxCandies;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println();
            System.out.print(result(arr, n, k));
        }
    }
}
