package testThree;
/*
Problem Statement: Minimum Length Word
Problem Level: MEDIUM
Problem Description:
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are separated by single space only.
Input Format :
String S

Output Format :
Minimum length word

Constraints :
1 <= Length of String S <= 10^5

Sample Input 1 :
this is test string

Sample Output 1 :
is

Sample Input 2 :
abc de ghihjk a uvw h j

Sample Output 2 :
a
 */
import java.util.*;
public class MinimumLengthWord {
    /*
     * si points to the starting of a new word and we traverse the string using ei.
     * Whenever a space or ‘\0’ character is encountered,we compute the length of
     * the current word using (ei – si) and compare it with the minimum and the maximum length so far.
     * If it is less, update the min_length and the min_start_index( which points to the starting of the minimum length word).
     * If it is greater, update the max_length and the max_start_index
     * ( which points to the starting of the maximum length word).
     * Finally, update minWord and maxWord which are output strings
     * that have been sent by reference with the substrings starting at
     * min_start_index and max_start_index of length min_length and max_length respectively.
     */
    private static String minLenWord(String s) {
        s = s.trim(); // trim trailing spaces
        int n = s.length();
        int si = 0;
        int ei = 0;
        int minLen = n;
        int minStartIdx = 0;
        while(ei <= n) {
            if(ei<n && s.charAt(ei) != ' ') {
                ei++;
            } else {
                int currLen = ei-si;
                if(currLen<minLen) {
                    minLen = currLen;
                    minStartIdx = si;
                }
                ei++;
                si=ei;
            }
        }
        return s.substring(minStartIdx, minStartIdx+minLen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = minLenWord(str);
        System.out.println(res);
    }
} // T.C. = O(n)
