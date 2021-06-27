/**
 * After completing binary search in unsuccessful result low will point to next highest, high will point to next lowest
 * dont forget the <= in BS
 */

import java.io.*;

public class BrokenEconomyBS {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());


        int low = 0, high = n - 1;

        if (k > a[high]) {
            System.out.println("Ceil does not exist");
            System.exit(0);
        }

        if(k < a[0]){
            System.out.println("Floor does not exist");
            System.exit(0);
        }

        while (low <= high) {
            int mid = (high + low) / 2;
            if (a[mid] == k) {
                low = mid;
                high = mid;
                break;
            } else if (a[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println(a[low]);
        System.out.println(a[high]);
    }
}