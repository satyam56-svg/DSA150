public class longest_palindrome {
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2)
            return s;

        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }

                    if (dp[i][j] && len > maxLen) {
                        start = i;
                        maxLen = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s)); // Output: "bab" or "aba"
    }
}

// STEPS:
// 1. initialse n with string length..
// 2. if n<2 return string..
// 3. initialse boolean 2d array dp with size n..
// 4. initialse start=0,maxLen=1..
// 5. run for loop from i=0 to i<n, dp[i][i]=true;
// 6. run a outer for loop(len=2 to len<=n)
// 7. run a inner for loop(i=0 to i<=n-len)
// 8. initialse j=i+len-1;
// 9. if s.charAt(i)==s.charAt(j)
// 10. if len==2, dp[i][j]=true
// 11. agar nhi, dp[i][j]=dp[i+1][j-1];
// 12. agar dp[i][j]==true && len>maxLen
// 13. start=i,maxLen=len;
// 14. return s.subString(start,start+maxlen);