import java.util.*;

public class MatrixMultiplication{

public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        
        if(c1 != r2){
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int res = 0;
                for(int k = 0; k < r2; k++){
                    // System.out.print("arr1["+i+"]["+k+"]*arr2["+k+"]["+j+"]" + " ");
                    res+=(arr1[i][k]*arr2[k][j]);
                }
                System.out.print(res+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }

}


/*
res = (arr1[0][0]*arr2[0][0]) + (arr1[0][1] * arr2[1][0]) + (arr1[0][2] * arr2[2][0]);
res = (arr1[0][0]*arr2[0][1]) + (arr1[0][1] * arr2[1][1]) + (arr1[0][2] * arr2[2][1]);
res = (arr1[0][0]*arr2[0][2]) + (arr1[0][1] * arr2[1][2]) + (arr1[0][2] * arr2[2][2]);
res = (arr1[0][0]*arr2[0][3]) + (arr1[0][1] * arr2[1][3]) + (arr1[0][2] * arr2[2][3]);


res = (arr1[1][0]*arr2[0][0]) + (arr1[1][1] * arr2[1][0]) + (arr1[1][2] * arr2[2][0]);
res = (arr1[1][0]*arr2[0][1]) + (arr1[1][1] * arr2[1][1]) + (arr1[1][2] * arr2[2][1]);
res = (arr1[1][0]*arr2[0][2]) + (arr1[1][1] * arr2[1][2]) + (arr1[1][2] * arr2[2][2]);
res = (arr1[1][0]*arr2[0][3]) + (arr1[1][1] * arr2[1][3]) + (arr1[1][2] * arr2[2][3]);

*/