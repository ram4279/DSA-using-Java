
/**
 * 1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.


3

[111, 12, 21, 3]

 */
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            var list = new ArrayList<String>();
            list.add("");
            return list;
        } else if (n < 0) {
            var list = new ArrayList<String>();
            return list;
        }

        var onesteppaths = getStairPaths(n - 1);
        var twosteppaths = getStairPaths(n - 2);
        var threesteppaths = getStairPaths(n - 3);

        var res = new ArrayList<String>();
        for (String path : onesteppaths) {
            res.add(1 + path);
        }
        for (String path : twosteppaths) {
            res.add(2 + path);
        }
        for (String path : threesteppaths) {
            res.add(3 + path);
        }

        return res;

    }

}
