package testFour;

import java.util.Scanner;

/*
Problem Statement: Strings of length k
Problem Level: MEDIUM
Problem Description:
Given a string S and an integer k, you need to find and
return all the possible strings that can be made of size k using only characters present in string S.
The characters can repeat as many times as needed and characters can come in any order.
Note : The number of output strings can be at max 1000.

Input format :
String S and Integer k (separated by space)

Output Format :
All possible strings (in different lines)

Constraints :
1 <= Length of String S <= 10
1 <= k <= 5

Sample Input 1 :
abc 2

Sample Output 1 :
aa
ab
ac
ba
bb
bc
ca
cb
cc
 */
public class StringofLengthK {
    // The method that prints all
    // possible strings of length k.
    // It is mainly a wrapper over
    // recursive function printAllKLengthRec()
    static void printAllKLength(char[] set, int k)
    {
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    // The main recursive method
    // to print all possible
    // strings of length k
    static void printAllKLengthRec(char[] set,
                                   String prefix,
                                   int n, int k)
    {

        // Base case: k is 0,
        // print prefix
        if (k == 0)
        {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i)
        {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix,
                    n, k - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char[] ch = new char[str.length()];
        for(int i=0; i<str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        printAllKLength(ch, n);
    }
} // T.C.=O(N^K) && S.C.=O(K)