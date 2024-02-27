package assignment;
/*
Problem Statement: Compress the String
Problem Level: MEDIUM
Problem Description:
Write a program to do basic string compression.
For a character which is consecutively repeated more than once,
replace consecutive duplicate occurrences with the count of repetitions.
Example:
If a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.

Note :
Consecutive count of every character in the input string is less than equal to 9.

Input Format :
The first and the only line of input contains a string(no spaces in between).

Output Format :
The only line of output print the compressed string.

Note:
Return the compressed string and hence, no need to print.

Constraints :
0 <= |S| <= 10^7
Where |S| represents the length of string, S.

Time Limit: 1sec

Sample Input 1 :
aaabbccdsa

Sample Output 1 :
a3b2c2dsa

Sample Input 2 :
aaabbcddeeeee

Sample Output 2 :
a3b2cd2e5
 */
import java.util.*;
public class CompressString {
    private static String compressStr(String s) {
        StringBuffer ans = new StringBuffer("");
        for(int i=0; i<s.length();i++) {
            Integer cnt = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                cnt++;
                i++;
            }
            ans.append(s.charAt(i));
            if(cnt>1) {
                ans.append(cnt.toString());
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compressStr(str));
    }
}
