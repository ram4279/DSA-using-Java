import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Nqueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        int[][] board = new int[n][n];
        solveNQueensUtil(board,"", 0, res);
        return res;
    }
    
    public static void solveNQueensUtil(int[][] board,String ans, int row, List<List<String>> res){
        if(row==board.length){
            var list = new ArrayList<String>();
            for(char ch: ans.toCharArray()){
                int colno = ch - '0';
                String s = "";
                for(int i = 0; i < board.length; i++){
                    if(i==colno) s+="Q";
                    else s+='.';
                }
                list.add(s);
            }
            res.add(list);
        }
        

        for(int col = 0; col < board.length; col++){
            if(checkifQueenSafe(board, row, col)){
                board[row][col] = 1;
                solveNQueensUtil(board, ans + col, row + 1, res);
                board[row][col] = 0;
            }

        }
            

        
    }
    
    

    //only check this 
    //   \ | /
    //    \|/
    //     a

    public static boolean checkifQueenSafe(int[][] chess, int row, int col){
        for(int i = row-1, j = col; i >= 0; i--){
            if(chess[i][j] == 1) return false;
        }
        
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1) return false;
        }
        
        for(int i = row-1, j = col+1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        var res = solveNQueens(n);
        System.out.println(res);
        sc.close();
    }
}