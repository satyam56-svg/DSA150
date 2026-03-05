public class anticlockwise_rot_matrix {
    public static void rotateMatrix(int[][] mat) {
        transpose(mat);
        reverse(mat);
    }
    
    public static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    
    public static void transpose(int arr[][]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                swap(arr, i, j);
            }
        }
    }
    
    public static void reverse(int arr[][]) {
        int n = arr.length;

        for(int j = 0; j < n; j++) {   // column reverse
            int top = 0;
            int bottom = n - 1;

            while(top < bottom) {
                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;

                top++;
                bottom--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateMatrix(mat);

        for (int[] mat1 : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat1[j] + " ");
            }
            System.out.println();
        }
    }
}
