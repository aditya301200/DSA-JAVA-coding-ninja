package testOne;
/*
Problem Statement: Palindrome number
Problem Level: EASY
Problem Description:
Write a program to determine if given number is palindrome or not.
Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one.
For eg. 121

Sample Input 1 :
121

Sample Output 1 :
true

Sample Input 2 :
1032

Sample Output 2 :
false
 */
import java.util.*;
public class PalindromeNumber {
    private static boolean isPalindrome(int n) {
        int temp = n;
        int x = 0;
        int i=0;
        while(n>0) {
            x = x*10 + (n%10);
            n=n/10;
            i++;
        }
//        System.out.println(x);
        if(x==temp) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
