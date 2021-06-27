import java.util.*;

public class Partitioning {

    public static void partition(int[] arr, int pivot) {
        // Regions
        // 0 to j-1 <= pivot
        // j to i-1 > pivot
        // i to end unknown

        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                swap(arr, i, j); // We are swapping smaller element with first greatest element
                i++;
                j++;
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        partition(arr, pivot);
        print(arr);
        scn.close();
    }

}