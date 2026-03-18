public class n_trail_zero {
    public static int findNum(int n) {
        int low = 1;
        int high = 5 * n;
        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int zeroes = countZero(mid);

            if(zeroes >= n) {
                ans = mid;
                high = mid - 1; // smaller try karo
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // count trailing zeroes in x!
    public static int countZero(int x) {
        int count = 0;

        while(x > 0) {
            x /= 5;
            count += x;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Smallest number with at least " + n + " trailing zeroes in factorial is: " + findNum(n));
    }
}
