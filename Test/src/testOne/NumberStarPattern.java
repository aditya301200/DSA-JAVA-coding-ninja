package testOne;
/*
Problem Statement: Number Star pattern 1
Problem Level: EASY
Problem Description:
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)

Output Format :
Pattern in N lines

Sample Input :
   5

Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */
import java.util.*;
public class NumberStarPattern {
    private static void printPatter(int n) {
        for(int i=0; i<n; i++) {
            for(int j=n; j>0; j--) {
                if(j==i+1) {
                    System.out.print("*");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPatter(n);
    }
}
