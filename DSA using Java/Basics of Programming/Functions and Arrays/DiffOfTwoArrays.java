import java.util.*;


//Assume n2 > n1
public class DiffOfTwoArrays {

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

        sc.close();
        int[] res = new int[n2];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n2 - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int d2 = j >= 0 ? arr2[j] : 0;
            int d1 = i >= 0 ? arr1[i] : 0;

            int diff = d2 - d1 - carry;
            if (diff < 0) {
                diff = 10 + diff;
                carry = 1;
            } else {
                carry = 0;
            }
            res[k--] = diff;
            j--;
            i--;
        }

        int t = 0;
        for (; t < res.length; t++) {
            if (res[t] != 0)
                break;
        }

        for (; t < res.length; t++) {
            System.out.println(res[t]);
        }

        sc.close();

    }

}