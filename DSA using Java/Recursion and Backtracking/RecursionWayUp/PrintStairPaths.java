import java.util.*;

public class PrintStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n, "");
        sc.close();
    }

    public static void printStairPaths(int n, String path) {
        if (n < 0)
            return;
        else if (n == 0) {
            System.out.println(path);
        }

        for (int i = 1; i <= 3; i++) {
            printStairPaths(n - i, path + i);
        }
    }

}