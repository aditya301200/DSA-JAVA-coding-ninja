package intermediate;
/*
Problem Statement: Replace character recursively
Problem Level: EASY
Problem Description:
Given an input string S and two characters c1 and c2,
you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)

Output Format :
Updated string

Constraints :
1 <= Length of String S <= 10^6

Sample Input :
abacd
a x

Sample Output :
xbxcd
 */
import java.util.*;
public class ReplceCharacter {
    private static String replaceChar(String str,char a, char b) {
        if(str.length()==0) {
            return str;
        }
        char ch = str.charAt(0);
        // If the character at starting
        // of the given string is equal
        // to a, replace it with b
        if(str.charAt(0)==a) {
            ch=b;
            str = b+str.substring(1);
        }
        return ch+replaceChar(str.substring(1), a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.println(replaceChar(str,a,b));
    }
}
