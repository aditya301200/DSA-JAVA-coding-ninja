package intermediate;
/*
Problem Statement: String to Integer
Problem Level: MEDIUM
Problem Description:
Write a recursive function to convert a given string into the number it represents.
That is input will be a numeric string that contains only numbers,
you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")

Output format :
Corresponding integer N (int, Eg. 1234)

Constraints :
0 <= |S| <= 9
where |S| represents length of string S.

Sample Input 1 :
1231

Sample Output 1 :
1231

Sample Input 2 :
12567

Sample Output 2 :
12567

Sample Input 2 :
0123

Sample Output 2 :
123
 */
import java.util.*;
public class StrToInt {
    private static int convertToInt(String str) {
        // If the number represented as a string
        // contains only a single digit
        // then returns its value
        if (str.length() == 1)
            return (str.charAt(0) - '0');

        // Recursive call for the sub-string
        // starting at the second character
        double y = convertToInt(str.substring(1));

        // First digit of the number
        double x = str.charAt(0) - '0';

        // First digit multiplied by the
        // appropriate power of 10 and then
        // add the recursive result
        // For example, xy = ((x * 10) + y)
        x = x * Math.pow(10, str.length() - 1) + y;
        return (int)(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(convertToInt(str));
    }
}
