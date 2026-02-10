public class kth_smallest_mat_ele {
    public static int kthSmallest(int[][] mat, int k) {
        
        int n = mat.length;
        
        int low = mat[0][0];
        int high = mat[n-1][n-1];
        
        while(low < high) {
            
            int mid = low + (high - low) / 2;
            
            int count = countLessEqual(mat, mid);
            
            if(count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
    
    public static int countLessEqual(int[][] mat, int val) {
        
        int n = mat.length;
        int i = n - 1;   // last row
        int j = 0;       // first column
        
        int count = 0;
        
        while(i >= 0 && j < n) {
            
            if(mat[i][j] <= val) {
                count += i + 1;
                j++;
            } else {
                i--;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        int result = kthSmallest(mat, k);
        System.out.println("The " + k + "-th smallest element is: " + result);
    }
}
