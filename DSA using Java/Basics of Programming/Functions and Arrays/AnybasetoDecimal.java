import java.util.*;

public class AnybasetoDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        int power = 1;
        int res = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            res += (lastdigit * power);
            power *= b;
            n /= 10;
        }
        return res;
    }
}