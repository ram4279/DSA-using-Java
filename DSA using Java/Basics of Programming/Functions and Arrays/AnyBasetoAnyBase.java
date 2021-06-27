import java.util.*;

public class AnyBasetoAnyBase {

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

    public static int getValueInBase(int n, int b) {
        int power = 1;
        int res = 0;
        while (n != 0) {
            int rem = n % b;
            res += (rem * power);
            n /= b;
            power *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        
        //Convert the given source to decimal and convert the decimal to dest base
        int decimalVal = getValueIndecimal(n, sourceBase);
        System.out.println(getValueInBase(decimalVal, destBase));
        scn.close();

    }
}