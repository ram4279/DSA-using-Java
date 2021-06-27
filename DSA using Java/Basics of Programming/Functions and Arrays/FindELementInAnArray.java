import java.util.*;

public class FindELementInAnArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();
        int[] arr = new int[nos];
        for (int i = 0; i < nos; i++)
            arr[i] = sc.nextInt();
        int d = sc.nextInt();

        int found = 0;

        for (int i = 0; i < nos; i++) {
            if (arr[i] == d) {
                System.out.println(i);
                found = 1;
                break;
            }
        }

        if (found == 0)
            System.out.println(-1);
        
        sc.close();

    }

}