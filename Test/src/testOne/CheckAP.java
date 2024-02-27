package testOne;
/*
Problem Statement: Check AP
Problem Level: EASY
Problem Description:
Given input consists of n numbers.
Check whether those n numbers form an arithmetic progression or not.
Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers

Sample Input 1 :
6
2 6 10 14 18 22

Sample Output 1 :
true

Sample Input 2 :
6
2 6 10 15 19 23

Sample Output 2 :
false
 */
import java.util.*;
public class CheckAP {
    private static boolean isAP(int[] arr, int n) {
        int a = arr[0];
        int d = arr[1] - arr[0];
        for(int i=2; i<n; i++) {
            if(a+i*d != arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isAP(arr,n));
    }
}
