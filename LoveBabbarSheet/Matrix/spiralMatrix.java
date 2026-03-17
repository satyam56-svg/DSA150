import java.util.ArrayList;

public class spiralMatrix {
    public static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> list = new ArrayList<>();
        int nrow = mat.length;
        int ncol = mat[0].length;

        int top = 0, bottom = nrow - 1;
        int left = 0, right = ncol - 1;

        while (top <= bottom && left <= right) {

            // left to right..
            for (int j = left; j <= right; j++) {
                list.add(mat[top][j]);
            }
            top++;

            // top to bottom..
            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;

            // right to left..
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(mat[bottom][j]);
                }
                bottom--;
            }

            // 4. Bottom to Top (Left column) - if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        ArrayList<Integer> result = spirallyTraverse(mat);
        System.out.println(result);
    }
}
