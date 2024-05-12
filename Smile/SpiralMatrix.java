public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 7,9,10, 11},
            {6, 10, 12, 13,20,21},
            {9, 25,29,30,32, 41},
            {15,55,59,63,68,70},
            {40,70,79,81,95,105}
        };

        printSpiralOrder(matrix);
    }

    // Function to print the matrix in spiral order
    public static void printSpiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        // Traverse the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Print the top row
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // Print the right column
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // Print the bottom row if there is any left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // Print the left column if there is any left
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
    }
}
