package Striver.Arrays.medium;

public class 2dmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
    // Check for null or empty matrix
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }

    // Get the number of rows and columns in the matrix
    int rows = matrix.length;
    int cols = matrix[0].length;

    // Start from the top-right corner of the matrix
    int row = 0;
    int col = cols - 1;

    // Loop until we reach the bottom-left corner of the matrix
    while (row < rows && col >= 0) {
        // Check if the current element is equal to the target
        if (matrix[row][col] == target) {
            return true; // Target found
        } else if (matrix[row][col] < target) {
            // If the current element is less than the target, move to the next row
            row++;
        } else {
            // If the current element is greater than the target, move to the previous column
            col--;
        }
    }

    return false; // Target not found
}

    
}
