
/**
 * 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.
 */
import java.util.*;

public class GetKpc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getKPC(str));
        sc.close();
    }
// 78
    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 1) {
            var elist = getMappingOfCh(str);
            return elist;
        }

        String ch = str.substring(0, 1);
        String remstr = str.substring(1);
        var resOfremstr = getKPC(remstr);
        var res = new ArrayList<String>();
        ArrayList<String> allcharsOfch = getMappingOfCh(ch);
        for (String os : allcharsOfch) {
            for(String is : resOfremstr ){
                res.add(os+is);
            }
        }
        return res;
    }
    private static ArrayList<String> getMappingOfCh(String s) {
        var res = new ArrayList<String>();
        if (s.equals("0")) {
            res.add(".");
            res.add(";");
        }
        if (s.equals("1")) {
            res.add("a");
            res.add("b");
            res.add("c");
        }
        if (s.equals("2")) {
            res.add("d");
            res.add("e");
            res.add("f");
        }
        if (s.equals("3")) {
            res.add("g");
            res.add("h");
            res.add("i");
        }
        if (s.equals("4")) {
            res.add("j");
            res.add("k");
            res.add("l");
        }
        if (s.equals("5")) {
            res.add("m");
            res.add("n");
            res.add("o");
        }
        if (s.equals("6")) {
            res.add("p");
            res.add("q");
            res.add("r");
            res.add("s");
        }
        if (s.equals("7")) {
            res.add("t");
            res.add("u");
        }
        if (s.equals("8")) {
            res.add("v");
            res.add("w");
            res.add("x");
        }
        if (s.equals("9")) {
            res.add("y");
            res.add("z");
        }
        return res;
    }
    

}