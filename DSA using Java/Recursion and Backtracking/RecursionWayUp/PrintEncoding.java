import java.util.*;

public class PrintEncoding {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str, "");
        sc.close();
    }

    static char[] notochar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 
    'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void printEncodings(String str, String ans) {
        if (str.length() == 0) {
            if (ans.length() == 0) {
                return;
            }
            System.out.println(ans);
        }

        if (str.length() == 1) {
            char tempans = str.charAt(0);
            if (tempans == '0')
                return;
            else
                tempans = notochar[Integer.parseInt(String.valueOf(tempans))];
            System.out.println(tempans);
        } else {
            String ques2 = str.substring(2);
            String tempans2 = str.substring(0, 2);
            if (tempans2.charAt(0) == '0')
                return;
            else if (Integer.parseInt(tempans2) < 26){
                tempans2 = String.valueOf(notochar[Integer.parseInt(tempans2)]);
                printEncodings(ques2, tempans2);
            } else {
                return;
            }
                
            
                
        }

    }

}