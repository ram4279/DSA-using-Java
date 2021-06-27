
/**
 * 1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

 */

 //Soln:1 
import java.util.*;

public class ExitPointofaMatrix {

    public static int boundarycheck(int i, int j, int r, int c) {
        if (j < 0) {
            return 1;
        } else if (i < 0) {
            return 2;
        } else if (i == r) {
            return 3;
        } else if (j == c) {
            return 4;
        }
        return 5;
    }

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

        int dir = 0;
        int right = 0, down = 1, left = 2, up = 3;
        int i = 0, j = 0;

        int x = 0;

        while (true) {
            if (dir == right) {
                j++;
                if ((x = boundarycheck(i, j, r, c)) < 5)
                    break;
                if (arr[i][j] == 1)
                    dir = down;
            } else if (dir == down) {
                i++;
                if ((x = boundarycheck(i, j, r, c)) < 5)
                    break;
                if (arr[i][j] == 1)
                    dir = left;
            } else if (dir == left) {
                j--;
                if ((x = boundarycheck(i, j, r, c)) < 5)
                    break;
                if (arr[i][j] == 1)
                    dir = up;
            } else if (dir == up) {
                i--;
                if ((x = boundarycheck(i, j, r, c)) < 5)
                    break;
                if (arr[i][j] == 1)
                    dir = right;
            }
            if ((x = boundarycheck(i, j, r, c)) < 5)
                break;

        }

        if (x == 1)
            j++;
        else if (x == 2)
            i++;
        else if (x == 3)
            i--;
        else if (x == 4)
            j--;

        System.out.println(i + "\n" + j);
        sc.close();

    }

}



//Soln 2 Optimised:

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int[][] arr = new int[r][c];

//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
        
//         int dir = 0;
//         int i = 0, j = 0;
        
//         while(true){
            
//             dir = (dir + arr[i][j]) % 4;
            
//             if(dir == 0){
//                 j++;
//             } else if(dir == 1){
//                 i++;
//             } else if(dir == 2){
//                 j--;
//             } else if(dir == 3) {
//                 i--;
//             }
            
//             if(j < 0){
//                 j++;
//                 break;
//             } else if (i < 0){
//                 i++;
//                 break;
//             } else if (i == r){
//                 i--;
//                 break;
//             } else if (j == c){
//                 j--;
//                 break;
//             }
//         }
        
//         System.out.println(i+"\n"+j);
        
        
//     }

// }