public class row_max_1 {
    public static int rowWithMax1s(int arr[][]) {

        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = m - 1;
        int ans = -1;

        while(i < n && j >= 0) {

            if(arr[i][j] == 1) {
                ans = i;   // current row has more 1s
                j--;       // move left
            } 
            else {
                i++;       // move down
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {0, 0, 0, 1},
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {0, 0, 0, 0}
        };

        System.out.println(rowWithMax1s(arr)); // Output: 1
    }
}
