import java.util.Arrays;

public class median_matrix {
    public static int median(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int help[]=new int[row*col];
        int k=0;
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                help[k++]=mat[i][j];
            }
        }
        
        Arrays.sort(help);
        
        return help[(row*col)/2];
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        System.out.println(median(mat)); // Output: 5
    }
}
