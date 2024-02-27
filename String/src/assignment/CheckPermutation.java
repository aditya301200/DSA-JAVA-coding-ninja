package assignment;
/*
Problem Statement: Check Permutation
Problem Level: EASY
Problem Description:
Given two strings, S and T, check if they are permutations of each other. Return true or false.
Permutation means - length of both the strings should same and should contain same set of characters. Order of characters doesn't matter.
Note : Input strings contain only lowercase english alphabets.
<br>
Input format :
Line 1 : String 1
Line 2 : String 2

Output format :
'true' or 'false'

Constraints :
0 <= |S| <= 10^7
0 <= |T| <= 10^7
where |S| represents the length of string, S.

Sample Input 1 :
abcde
baedc

Sample Output 1 :
true

Sample Input 2 :
abc
cbd

Sample Output 2 :
false
 */
import java.util.*;
public class CheckPermutation {
    private static boolean checkPermutation(String s1, String s2) {
        char[] arr1 = new char[128];
        char[] arr2 = new char[128];
        arr1 = s1.toCharArray();
        arr2 = s2.toCharArray();
        if(arr1.length != arr2.length) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i=0; i<arr1.length; i++) {
                if(arr1[i]!=arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(checkPermutation(str1,str2));
    }
}
