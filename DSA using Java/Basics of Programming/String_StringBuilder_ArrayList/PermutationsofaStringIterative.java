
/**
 * https://youtu.be/39SKIuA-ieY?list=TLGG1A9lKIUF2RMyNTA1MjAyMQ
 */
import java.util.*;

public class PermutationsofaStringIterative {

    public static int getTotalPerms(String str) {
        int len = str.length();
        int perms = 1;
        for (int i = 1; i <= len; i++) {
            perms *= i;
        }
        return perms;
    }

    public static void solution(String str) {
        int perms = getTotalPerms(str);
        int len = str.length();
        for (int i = 0; i < perms; i++) {
            var tempstr = new StringBuilder(str);
            int tempi = i;
            for (int div = len; div > 0; div--) {
                int rem = tempi % div;
                tempi /= div;
                System.out.print(tempstr.charAt(rem));
                tempstr.deleteCharAt(rem);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

}