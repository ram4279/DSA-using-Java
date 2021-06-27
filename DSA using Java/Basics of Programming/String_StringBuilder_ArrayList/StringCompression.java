
/**
 * 
 * Sample Input
wwwwaaadexxxxxx
Sample Output
wadex
w4a3dex6
 */
import java.util.*;

public class StringCompression {

    public static String compression1(String str) {
        if(str.length() <= 1) return str;
        String res = "";
        res+=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if (curr != prev) {
                res += curr;
            }
        }
        return res;
    }

    public static String compression2(String str) {
        String res = "";
        int count = 1;
        char curr = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (curr != str.charAt(i)) {
                res += curr;
                res += count == 1 ? "" : count;
                count = 0;
                curr = str.charAt(i);
            }
            count++;
        }

        if (res.length() == 0 || curr != res.charAt(res.length() - 1)) {
            res += curr;
            res += count == 1 ? "" : count;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        scn.close();
    }

}