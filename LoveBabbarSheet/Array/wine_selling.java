public class wine_selling {
    public static long wineSelling(int Arr[], int N) {
        
        long work = 0;
        long balance = 0;
        
        for(int i = 0; i < N; i++) {
            balance += Arr[i];          // cumulative surplus/deficit
            work += Math.abs(balance);  // cost add
        }
        
        return work;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] Arr = {5, -4, 1, -3, 1};
        
        long result = wineSelling(Arr, N);
        System.out.println(result); // Output: 9
    }
}
