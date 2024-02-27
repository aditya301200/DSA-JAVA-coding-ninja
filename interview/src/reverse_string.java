
import java.util.*;
public class reverse_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        System.out.print("Enter string: ");
        String str = sc.next();
        for(int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);

    }
}
