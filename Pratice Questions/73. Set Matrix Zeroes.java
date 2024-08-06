import java.util.ArrayList;
import java.util.List;

//Brute force
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         List<Integer> marked_row = new ArrayList<>();
//         List<Integer> marked_col = new ArrayList<>();

//         // Mark rows and columns that need to be zeroed
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     // Mark entire row and column
//                     if (!marked_row.contains(i)) {
//                         marked_row.add(i);
//                     }
//                     if (!marked_col.contains(j)) {
//                         marked_col.add(j);
//                     }
//                 }
//             }
//         }

//         // Set marked rows to zero
//         for (int row : marked_row) {
//             for (int j = 0; j < cols; j++) {
//                 matrix[row][j] = 0;
//             }
//         }

//         // Set marked columns to zero
//         for (int col : marked_col) {
//             for (int i = 0; i < rows; i++) {
//                 matrix[i][col] = 0;
//             }
//         }
//     }
// }

//optimal

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row_arr[] = new int[rows ];
        int col_arr[] = new int[cols ];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row_arr[i] = 1;
                    col_arr[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row_arr[i] == 1 || col_arr[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}