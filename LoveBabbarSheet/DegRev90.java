public class DegRev90 {

    // Transpose function
    static void transpose(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // double swap avoid
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Reverse each row
    static void rev(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    // Rotate 90 degree clockwise
    static void rotate(int mat[][]) {

        transpose(mat);
        rev(mat);
    }

    // Main function for testing
    public static void main(String[] args) {

        int mat[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        rotate(mat);

        // print result
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat1[j] + " ");
            }
            System.out.println();
        }
    }
}

