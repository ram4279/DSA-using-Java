import java.util.*;

public class ToggleCase {

    public static String toggleCase(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ('A' + ch - 'a');
            } else {
                ch = (char) ('a' + ch - 'A');
            }
            str.append(ch);
        }
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
        scn.close();
    }

}