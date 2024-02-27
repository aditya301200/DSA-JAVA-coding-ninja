package assignment;
/*
Problem Statement: Reverse Each Word
Problem Level: MEDIUM
Problem Description:
Given a string S, reverse each word of a string individually.
For eg. if a string is "abc def", reversed string should be "cba fed".
Input Format :
String S

Output Format :
Modified string

Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.

Sample Input 1:
Welcome to Coding Ninjas

Sample Output 1:
emocleW ot gnidoC sajniN

Sample Input 2:
Give proper names to variables and functions

Sample Output 2:
eviG reporp seman ot selbairav dna snoitcnuf
 */
import java.util.*;
public class ReverseEachWord {
    private static String reverseWord(String s) {
        String ans = "";
        int currentWordStart = 0;
        for(int i=0; i<s.length();i++) {
            if(s.charAt(i)==' ') {
                int currentWordEnd = i-1;
                String reverseWord="";
                for(int j=currentWordStart; j<=currentWordEnd; j++) {
                    reverseWord = s.charAt(j)+reverseWord;
                }
                ans += reverseWord+" ";
                currentWordStart = i+1;
            }
        }
        String temp = "";
        for(int i=currentWordStart; i<s.length(); i++ ) {
            temp = s.charAt(i)+temp;
        }
        ans+=temp;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWord(str));
    }
}
