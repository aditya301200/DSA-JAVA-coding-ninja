package intermediate;
/*
Problem Statement: Replace pi (recursive)
Problem Level: MEDIUM
Problem Description:
Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".

Sample Input 1 :
xpix

Sample Output :
x3.14x

Sample Input 2 :
pipi

Sample Output :
3.143.14

Sample Input 3 :
pip

Sample Output :
3.14p
 */
import java.util.*;
public class ReplacePI {
    private static String replacePI(String str) {
        if(str.length()<=1) {
            return str;
        }
        if(str.length()>=2 && str.charAt(0)=='p' && str.charAt(1)=='i') {
            return "3.14"+replacePI(str.substring(2,str.length()));
        }
        return str.charAt(0)+replacePI(str.substring(1, str.length()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(replacePI(str));
    }
}
