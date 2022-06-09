public class Matrixrotation {
    // rotates the elements mehtod;
    public static void matrixRotation(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = temp;

            }

        }

    }
    //print the matrix function.....
    public static void printMatrix(int[] [] matrix){
        for (int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
            System.out.print(matrix[i][j]+ " ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n =3;
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        matrixRotation(matrix);
        printMatrix(matrix);
    }
}
