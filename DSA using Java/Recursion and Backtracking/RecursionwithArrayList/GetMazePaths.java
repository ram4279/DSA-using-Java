import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(1, 1, n, m));
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            var list = new ArrayList<String>();
            list.add("");
            return list;
        }

        var horpathplus1 = new ArrayList<String>();
        var vertpathplus1 = new ArrayList<String>();

        if (sc < dc) {
            horpathplus1 = getMazePaths(sr, sc + 1, dr, dc);
        }

        if (sr < dr) {
            vertpathplus1 = getMazePaths(sr + 1, sc, dr, dc);
        }

        var res = new ArrayList<String>();

        for (String s : horpathplus1) {
            res.add("h" + s);
        }
        for (String s : vertpathplus1) {
            res.add("v" + s);
        }

        return res;

    }

}