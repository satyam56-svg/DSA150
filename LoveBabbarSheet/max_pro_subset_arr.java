import java.util.List;

public class max_pro_subset_arr {
    public static long findMaxProduct(List<Integer> arr) {

        long mod = 1000000007;
        int n = arr.size();

        if(n == 1) return arr.get(0);

        long prod = 1;
        int neg = 0, zero = 0;
        int maxNeg = Integer.MIN_VALUE;

        for(int x : arr) {

            if(x == 0) {
                zero++;
                continue;
            }

            if(x < 0) {
                neg++;
                maxNeg = Math.max(maxNeg, x);
            }

            prod = (prod * x) % mod;
        }

        if(zero == n) return 0;

        if(neg % 2 == 1) {

            if(neg == 1 && zero + neg == n)
                return 0;

            prod /= maxNeg;
        }

        return prod % mod;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(-1, -2, -3, 0);
        System.out.println(findMaxProduct(arr));
    }
}
