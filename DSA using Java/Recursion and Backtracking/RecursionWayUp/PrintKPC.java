import java.util.*;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
        sc.close();
    }

    static String[] notocharmap = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String digitChars = notocharmap[ch - '0'];
        String remques = str.substring(1);
        for (int i = 0; i < digitChars.length(); i++) {
            printKPC(remques, ans + digitChars.charAt(i));
        }
    }

}