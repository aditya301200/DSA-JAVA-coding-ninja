package assignment;
/*
Problem Statement: Remove character
Problem Level: EASY
Problem Description:
Given a string and a character x.
Write a function to remove all occurrences of x character from the given string.
Leave the string as it is, if the given character is not present in the string.

Input Format :
Line 1 : String S
Line 2 : Character c

Output Format :
Modified string

Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.

Sample Input 1:
welcome to coding ninjas
o

Sample Output 1:
welcme t cding ninjas

Sample Input 2:
Think of edge cases before submitting solutions
x

Sample Output 2:
Think of edge cases before submitting solutions
 */
import java.util.*;
public class RemoveCharacter {
    public static String RemoveChar(String s, char ch) {
        String ans="";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=ch) {
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(RemoveChar(str,ch));
    }
}
