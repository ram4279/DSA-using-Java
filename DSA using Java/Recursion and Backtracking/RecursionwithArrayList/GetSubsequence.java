
/**
 * 1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

abc

[, c, b, bc, a, ac, ab, abc]

 */
import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(gss(str));
        sc.close();
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            var list = new ArrayList<String>();
            list.add("");
            return list;
        }

        String fc = str.substring(0, 1);
        String remstr = str.substring(1);
        var tempres = gss(remstr);
        var res = new ArrayList<String>();

        for (String s : tempres) {
            res.add("" + s);
        }
        for (String s : tempres) {
            res.add(fc + s);
        }

        return res;

    }

}