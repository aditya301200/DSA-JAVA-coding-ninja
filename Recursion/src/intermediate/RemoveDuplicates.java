package intermediate;
/*
Problem Statement: Remove Duplicates
Problem Level: EASY
Problem Description:
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S

Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba

Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz

Sample Output 2 :
xyzwz
 */
import java.util.*;
public class RemoveDuplicates {
    private static String remove(String str) {
        if(str.length()<=1) {
            return str;
        }
        if(str.charAt(0)==str.charAt(1)) {
            return remove(str.substring(1));
        } else {
            return str.charAt(0)+remove(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(remove(str));
    }
}
