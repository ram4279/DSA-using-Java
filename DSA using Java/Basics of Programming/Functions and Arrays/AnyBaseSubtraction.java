import java.util.*;

public class AnyBaseSubtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int base, int n1, int n2) {
        int b = 0;
        int power = 1;
        int res = 0;
        while (n1 != 0 || n2 != 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int diff = d2 - d1 - b;

            if (diff < 0) {
                diff = diff + base;
                b = 1;
            } else {
                b = 0;
            }

            res += (diff * power);

            n1 /= 10;
            n2 /= 10;
            power *= 10;
        }

        return res;
    }

}