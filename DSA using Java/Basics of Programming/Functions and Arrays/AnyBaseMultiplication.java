import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {
        int carry = 0;
        int res = 0;
        int power = 1;
        while (n1 != 0 || n2 != 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int sum = d1 + d2 + carry;
            carry = sum / b;
            sum = sum % b; // this is base 8 add eg assume sum = 10 sum % 8 = 2 thats how it works
            res += (sum * power);
            power *= 10;
            n1 /= 10;
            n2 /= 10;
        }

        return res;
    }

    public static int getProduct(int b, int n1, int n2) {
        int res = 0;
        int globalpower = 1;
        while (n2 != 0) {
            int d2 = n2 % 10;
            int temp = n1;
            int carry = 0;
            int power = 1;
            int tempres = 0;
            while (temp != 0) {
                int d1 = temp % 10;
                int prod = d2 * d1 + carry;
                carry = prod / b;
                prod = prod % b;
                tempres += (prod * power);
                power *= 10;
                temp /= 10;
            }
            if (carry > 0)
                tempres += (carry * power);

            res = getSum(b, res, tempres * globalpower);
            globalpower *= 10;
            n2 /= 10;
        }
        return res;
    }

}