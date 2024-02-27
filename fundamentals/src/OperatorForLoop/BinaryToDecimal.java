package OperatorForLoop;
/*
Problem Statement: Binary to decimal
Problem Level: EASY
Problem Description:
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format

Output format :
Corresponding Decimal number (as integer)

Constraints :
0 <= N <= 10^9

Sample Input 1 :
1100

Sample Output 1 :
12

Sample Input 2 :
111

Sample Output 2 :
7
 */
import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary digit: ");
        int num = sc.nextInt();
        int ans = 0;
        int rem;
        int i = 0;
        while(num!=0) {
            rem=num%10;
            num = num/10;
            if(rem==1) {
                ans+=Math.pow(2, i);
            }
            i++;
        }
        System.out.print("Decimal number is: "+ ans);
    }
}
