public class count_palindrome {
    public static int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (len <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println("Total Palindromic Substrings: " + countSubstrings(s)); // Output: 6
    }
}

// STEPS:
// 1. initialse dp array(2d) with size (n)..
// 2. initialse count with 0..
// 3. outer loop (len=1 se len<=n)
// 4. inner loop(i=0 se i<=n-len)
// 5. initialse (j) with i+len-1
// 6. agar s.charAt(i)==s.charAt(j) ho
// 7. isme len<=2, dp[i][j]=true
// 8. agr len<=2 nhi h to dp[i][j]=dp[i+1][j-1]
// 9. agr dp[i][j]==true then, count++
// 10. return count