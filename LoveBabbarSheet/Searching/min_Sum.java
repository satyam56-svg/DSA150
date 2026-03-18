import java.util.Arrays;

public class min_Sum {

    public static String minSum(int[] arr) {
        Arrays.sort(arr);

        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                first.append(arr[i]);
            } else {
                second.append(arr[i]);
            }
        }

        return addStrings(first.toString(), second.toString());
    }

    // String addition (safe)
    public static String addStrings(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';

            res.append(sum % 10);
            carry = sum / 10;
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        System.out.println("Minimum sum of two numbers formed from array: " + minSum(arr));
    }
}
