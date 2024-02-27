package assignment;
/*
Problem Statement: Highest Occurring Character
Problem Level: EASY
Problem Description:
Given a string, S, find and return the highest occurring character present in the given string.
If there are 2 characters in the input string with same frequency,
return the character which comes first.

Note : Assume all the characters in the given string are lowercase.

Input format :
String S

Output format :
Highest occurring character

Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.

Sample Input 1:
abdefgbabfba

Sample Output 1:
b

Sample Input 2:
C

Sample Output 2:
x

 */
import java.util.*;
public class HighestOccuerence {
    private static char maxOccurChar(String s) {
        int[] charArr = new int[256];
        int n = s.length();
        for(int i=0; i<n; i++) {
            charArr[s.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        char ans = ' ';
        for(int i=0; i<n; i++) {
            if(max<charArr[s.charAt(i)]) {
                max = charArr[s.charAt(i)];
                ans = s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(maxOccurChar(str));
    }
}
