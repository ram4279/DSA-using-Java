import java.util.*;

public class SumOfTwoArrays {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        int max = Math.max(n1, n2);

        int[] res = new int[max + 1];


        int k = max;
        int carry = 0;

        n1--;
        n2--;

        while (n1 >= 0 || n2 >= 0 || carry > 0) {
            int d1 = (n1 >= 0) ? arr1[n1--] : 0;
            int d2 = (n2 >= 0) ? arr2[n2--] : 0;
            int sum = d1 + d2 + carry;
            res[k--] = sum % 10;
            carry = sum / 10;
        }

        for (int n : res) {
            System.out.println(n);
        }
        sc.close();
    }

}