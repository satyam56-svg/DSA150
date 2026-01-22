package BitManipulation;

public class sum {
    public static int getSum(int a, int b) {
        while(b!=0) {
            int sum=a^b;
            int carry=(a&b)<<1;
            a=sum;
            b=carry;
        }
        return a;
    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println(getSum(a,b));
    }
}

// Time Complexity: O(log(max(a,b)))
// Space Complexity: O(1)
// This code calculates the sum of two integers without using the '+' operator by utilizing bitwise operations.

// steps:
// 1. Initialize a loop that continues until there are no carry bits left (b != 0).
// 2. Inside the loop, calculate the sum without carry using the XOR operation (a ^ b).
// 3. Calculate the carry bits using the AND operation followed by a left shift ((a & b) << 1).
// 4. Update 'a' to be the sum and 'b' to be the carry.
// 5. Once there are no carry bits left, return 'a' which contains the final sum.   

// Example: For a=5 (0101) and b=7 (0111)
// Iteration 1: sum=2 (0010), carry=12 (1100)
// Iteration 2: sum=14 (1110), carry=0 (0000)
// Final Result: 12 (1100)