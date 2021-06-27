import java.util.*;

public class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int aptr = 0, bptr = 0, rptr = 0;

        while (aptr < a.length && bptr < b.length) {
            int a_ele = a[aptr];
            int b_ele = b[bptr];

            if (a_ele <= b_ele) {
                res[rptr++] = a_ele;
                aptr++;
            } else {
                res[rptr++] = b_ele;
                bptr++;
            }
        }

        while (aptr < a.length)
            res[rptr++] = a[aptr++];
        while (bptr < b.length)
            res[rptr++] = b[bptr++];

        return res;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
        scn.close();
    }

}