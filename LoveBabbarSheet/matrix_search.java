public class matrix_search {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
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
        int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int x = 5;
        System.out.println(matSearch(mat, x)); // Output: true
    }
}
