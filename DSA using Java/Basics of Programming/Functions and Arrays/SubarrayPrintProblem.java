import java.io.*;

public class SubarrayPrintProblem {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        //k handles the starting point
        for (int k = 0; k < n; k++) {
            for (int i = k; i < n; i++) { //i handles the end point
                for (int j = k; j <= i; j++) { //j prints inthe range
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }

        

    }

}