public class Shape4 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        int[][] matrix = new int[rows][columns];

        // pola matriks
        int value = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = value;
                    value++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    matrix[i][j] = value;
                    value++;
                }
            }
        }

        // Menampilkan matriks
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
