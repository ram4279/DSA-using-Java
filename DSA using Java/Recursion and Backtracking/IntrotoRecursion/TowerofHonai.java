import java.io.*;
import java.util.*;

public class TowerofHonai {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = sc.next().toCharArray()[0];
        char b = sc.next().toCharArray()[0];
        char c = sc.next().toCharArray()[0];
        toh(n, a, b, c);
    }

    public static void toh(int n, char a, char b, char c) {
        if (n == 0)
            return;
        toh(n - 1, a, c, b);
        System.out.println(n + "[" + a + " -> " + b + "]");
        toh(n - 1, c, b, a);
    }

}