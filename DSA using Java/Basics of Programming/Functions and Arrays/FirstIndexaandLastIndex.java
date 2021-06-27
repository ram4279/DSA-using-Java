import java.util.*;

public class FirstIndexaandLastIndex {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int d = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int lowestindex = -1;
        int highestindex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == d) {
                lowestindex = mid;
                high = mid - 1;
            } else if (arr[mid] > d) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(lowestindex);

        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == d) {
                highestindex = mid;
                low = mid + 1;
            } else if (arr[mid] > d) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(highestindex);

        sc.close();

    }

}