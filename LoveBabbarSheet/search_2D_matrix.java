public class search_2D_matrix {
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        int i = 0;
        int j = mat[0].length - 1;

        while (i < mat.length && j >= 0) {
            if (mat[i][j] > x) {
                j--;
            } else if (mat[i][j] < x) {
                i++;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 } };
        int x = 3;
        boolean result = searchMatrix(mat, x);
        System.out.println("Element " + x + " found in the matrix: " + result);
    }
}
