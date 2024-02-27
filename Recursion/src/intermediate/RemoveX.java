package intermediate;
/*
Problem Statement: Remove X
Problem Level: MEDIUM
Problem Description:
Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S.

Sample Input 1 :
xaxb

Sample Output 1:
ab

Sample Input 2 :
abc

Sample Output 2:
abc

Sample Input 3 :
xx

Sample Output 3:

 */
import java.util.*;
public class RemoveX {
    private static String removeX(String str) {
        if(str.length()==0) {
            return "";
        }
        if(str.charAt(0)=='x') {
            return removeX(str.substring(1));
        }
        return str.charAt(0)+removeX(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeX(str));
    }
}
