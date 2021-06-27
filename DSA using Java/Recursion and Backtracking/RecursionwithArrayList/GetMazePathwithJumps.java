import java.util.*;

public class GetMazePathwithJumps {

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

        ArrayList<String> paths = new ArrayList<String>();
        for (int i = 1; i <= dc - sc; i++) { // horizontal moves
            var horizontalPaths = getMazePaths(sr, sc + i, dr, dc);
            for (String hpath : horizontalPaths) {
                paths.add("h" + i + hpath);
            }
        }

        for (int i = 1; i <= dr - sr; i++) { // horizontal moves
            var verticalPaths = getMazePaths(sr + i, sc, dr, dc);
            for (String vpath : verticalPaths) {
                paths.add("v" + i + vpath);
            }
        }

        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) { // horizontal moves
            var diagnolPaths = getMazePaths(sr + i, sc + i, dr, dc);
            for (String dpath : diagnolPaths) {
                paths.add("d" + i + dpath);
            }
        }

        return paths;
    }

}