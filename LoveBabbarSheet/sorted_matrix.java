import java.util.Arrays;

public class sorted_matrix {
    public static int[][] sortedMatrix(int N, int Mat[][]) {
        int ans[][]=new int[N][N];
        int help[]=new int[N*N];
        
        int k=0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                help[k++]=Mat[i][j];
            }
        }
        
        Arrays.sort(help);
        
        int x=0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                ans[i][j]=help[x++];
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int N = 3;
        int Mat[][] = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] sortedMat = sortedMatrix(N, Mat);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sortedMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
