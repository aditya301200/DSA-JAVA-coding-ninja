package OperatorForLoop;
/*
Problem Statement: Decimal to Binary
Problem Level: MEDIUM
Problem Description:
Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.
<br>
Input format :
Integer N

Output format :
Corresponding Binary number (long)

Constraints :
0 <= N <= 10^5

Sample Input 1 :
12

Sample Output 1 :
1100

Sample Input 2 :
7

Sample Output 2 :
111
 */
import java.util.*;
public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dicmal value: ");
        int num = sc.nextInt();
        int ans=0;
        int rem;
        int i=0;
        while(num!=0) {
            rem = num%2;
            ans += (int)Math.pow(10, i)*rem;
            num=num/2;
            i++;
        }
        System.out.print("Binary Number is: "+ans);
    }
}
