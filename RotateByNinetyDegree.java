import java.util.*;
class RotateByNinetyDegree{
    public static void rotate(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        //Transpose the matrix
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < m; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Reverse the rows
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][m - 1 - j];
                mat[i][m - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        rotate(mat);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}