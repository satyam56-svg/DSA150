public class maxSubString {
    int maxSubstring(String S) {
        int maxSum = -1;
        int currSum = 0;

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '0') {
                currSum += 1;
            } else {
                currSum -= 1;
            }

            if(currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum == 0 ? -1 : maxSum;
    }

    public static void main(String[] args) {
        maxSubString solution = new maxSubString();
        String S = "1100011";
        int result = solution.maxSubstring(S);
        System.out.println(result); // Output: 4
    }
}
