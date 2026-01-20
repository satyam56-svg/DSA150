package binarysearch;

public class search_2D_matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0) {
            if(target==matrix[i][j]) {
                return true;
            } else if(target>matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60},
            {60, 61, 62, 63}
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target)); // Output: true
    }

}
