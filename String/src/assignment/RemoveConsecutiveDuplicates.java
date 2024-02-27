package assignment;

import java.util.Scanner;

/*
Problem Statement: Remove Consecutive Duplicates
Problem Level: EASY
Problem Description:
Given a string, S, remove all the consecutive duplicates that are present in the given string.
That means, if 'aaa' is present in the string then it should become 'a' in the output string.
Input format :
String S

Output format :
Modified string

Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.

Sample Input 1:
aabccbaa

Sample Output 1:
abcba

Sample Input 2:
xxyyzxx

Sample Output 2:
xyzx
 */
import java.util.*;
public class RemoveConsecutiveDuplicates {
    private static String removeDuplicates(String s) {
        String str = "";
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i)!=s.charAt(i+1)) {
                str+=s.charAt(i);
            }
        }
        str+=s.charAt(s.length()-1);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeDuplicates(str));
    }
}
