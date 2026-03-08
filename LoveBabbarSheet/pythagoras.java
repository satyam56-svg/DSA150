public class pythagoras {
    public static boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;
        int max = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        boolean hash[] = new boolean[max * max + 1];

        for(int i = 0; i < n; i++) {
            int sq = arr[i] * arr[i];
            hash[sq] = true;
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int sum = arr[i]*arr[i] + arr[j]*arr[j];
                if(sum <= max*max && hash[sum]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
        System.out.println(pythagoreanTriplet(arr));
    }
}
