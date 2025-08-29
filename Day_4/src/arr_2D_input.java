import java.util.Scanner;

public class arr_2D_input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = s.nextInt();
        System.out.print("Enter number of columns: ");
        int m = s.nextInt();
        int a = n*m;
        System.out.printf("Enter "+a+" for the matrix:");
        int[][] mat = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0 ;j<m;j++){
                mat[i][j] = s.nextInt();
            }
        }

        for(int[] t : mat){
            for (int b : t){
                System.out.print(b+" ");
            }
            System.out.println();
        }

        // Row-wise sum
        for(int i=0; i<n; i++){
            int rowSum = 0;
            for(int j=0; j<m; j++){
                rowSum += mat[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        int totalSum = 0;
        for(int[] row : mat){
            for(int val : row){
                totalSum += val;
            }
        }
        System.out.println("Total sum of matrix: " + totalSum);

    }
}
