package testTwo;
/*
Problem Statement: Number Star Pattern
Problem Level: MEDIUM
Problem Description:
Print the following pattern for given number of rows.
Input format :
Line 1 : N (Total number of rows)

Sample Input :
   5

Sample Output :
1234554321
1234**4321
123****321
12******21
1********1
 */
import java.util.*;
public class NumberStarPattern {
    private static void printPattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=1; j<n-i+1; j++) {
                System.out.print(j);
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            for(int j=n-i; j>0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
}
