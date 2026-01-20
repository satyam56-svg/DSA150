public class plus_one {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            // agar 9 se chhota hai toh 1 add karke return kar do
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // agar 9 hai toh 0 bana do and carry aage le jao
            digits[i] = 0;
        }

        // agar poora number 999... tha toh ab sab 0 honge, naya array banake 1 daalna padega
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        
        // Print the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        // Output should be: 1 2 4

        System.out.println(); // For a new line after output
        int[] digits2 = {9, 9, 9};
        int[] result2 = plusOne(digits2);
        // Print the result for second case
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        // Output should be: 1 0 0 0
        System.out.println(); // For a new line after output
    }
}

