
import java.io.*;
import java.util.*;


public class RingRotate {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int rot = sc.nextInt();

        // display(arr);

        ringRotate(arr, s, rot);

        display(arr);

    }

    private static void ringRotate(int[][] arr, int s, int rot) {
        int[] onedarr = getOnedArray(arr, s);
        rotate(onedarr, rot);
        fillArrayWithModifiedOneDArr(arr, s, onedarr);
    }

    private static void fillArrayWithModifiedOneDArr(int[][] arr, int s, int[] onedarr) {
        int minr = s - 1, minc = s - 1;
        int maxr = arr.length - s, maxc = arr[0].length - s;
        // can also be
        // 2mxr-2mir+2 + 2mxc - 2mic + 2 - 4
        // 2mxr-2mir + 2mxc - 2mic
        // 2 (mxr - mir + mxc - mic)

        int idx = 0;
        // left wall;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = onedarr[idx];
            idx++;
        }
        // bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = onedarr[idx];
            idx++;
        }

        // right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = onedarr[idx];
            idx++;
        }

        // top wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            arr[i][j] = onedarr[idx];
            idx++;
        }

    }

    private static int[] getOnedArray(int[][] arr, int s) {
        int minr = s - 1, minc = s - 1;
        int maxr = arr.length - s, maxc = arr[0].length - s;
        int newarrsize = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4;
        // can also be
        // 2mxr-2mir+2 + 2mxc - 2mic + 2 - 4
        // 2mxr-2mir + 2mxc - 2mic
        // 2 (mxr - mir + mxc - mic)
        int[] onedarr = new int[newarrsize];

        int idx = 0;
        // left wall;
        for (int i = minr, j = minc; i <= maxr; i++) {
            onedarr[idx] = arr[i][j];
            idx++;
        }
        // bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            onedarr[idx] = arr[i][j];
            idx++;
        }

        // right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            onedarr[idx] = arr[i][j];
            idx++;
        }

        // top wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            onedarr[idx] = arr[i][j];
            idx++;
        }

        return onedarr;

    }

    private static void rotate(int[] onedarr, int rot) {
        int len = onedarr.length;
        rot = rot % len;
        if (rot < 0)
            rot = len + rot;
        reverseArray(onedarr, 0, len - rot - 1);
        reverseArray(onedarr, len - rot, len - 1);
        reverseArray(onedarr, 0, len - 1);
    }

    private static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}