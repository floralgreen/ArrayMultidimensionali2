public class Main {

    public static void main(String[] args) {

        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        System.out.println("Starting matrix");
        printMatrix(matrix);
        
        System.out.println("Inverted matrix");
        printMatrix(invertMatrix(matrix));

    }

    public static int[][] invertMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] invertedMatrix = new int[columns][rows];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                invertedMatrix[j][i] = matrix[i][j];
            }
        }
        return invertedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
