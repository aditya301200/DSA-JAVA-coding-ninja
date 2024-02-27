package basic;
/*
Problem Statement: Number of digits
Problem Level: EASY
Problem Description:
Given the code to find out and return the number of digits present in a number recursively.
But it contains few bugs, that you need to rectify such that all the test cases should pass.
Input Format :
Integer n

Output Format :
Count of digits

Constraints :
1 <= n <= 10^6

Sample Input 1 :
 156

Sample Output 1 :
3

Sample Input 2 :
 7

Sample Output 2 :
1
 */
import java.util.*;
public class NumberOfDigits {
    static int count = 0;
    private static int countDigit(int n) {
        if(n > 0) {
            count++;
            countDigit(n/10);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigit(n));
    }
}
