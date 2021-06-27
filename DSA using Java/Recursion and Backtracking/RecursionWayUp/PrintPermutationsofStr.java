import java.util.*;

public class PrintPermutationsofStr {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str, "");
        sc.close();
    }

    public static void printPermutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
        }

        for (int i = 0; i < str.length(); i++) {
            char tempans = str.charAt(i);
            String ques = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ques, ans + tempans);
        }

    }

}