package assignment;
/*
Problem Statement: Reverse string Word Wise
Problem Level: MEDIUM
Problem Description:
Reverse the given string word wise.
That is, the last word in given string should come at 1st place,
last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line

Output format :
Word wise reversed string in a single line

Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.

Sample Input 1:
Welcome to Coding Ninjas

Sample Output 1:
Ninjas Coding to Welcome

Sample Input 2:
Always indent your code

Sample Output 2:
code your indent Always
 */
import java.util.*;
public class ReverseWord {
    private static String reverseWordWise(String s) {
        String res = "";
        int end = s.length();
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)==' ') {
                res += s.substring(i+1,end)+" ";
                end = i;
            }
        }
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)==' ') {
                res+=s.substring(0,i);
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//		System.out.println(str.length());
        System.out.println(reverseWordWise(str));
    }
}
