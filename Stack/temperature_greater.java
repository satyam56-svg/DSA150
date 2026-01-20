// package Stack;
import java.util.Stack;
public class temperature_greater {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();  

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = 0; 
            } else {
                res[i] = st.peek() - i; 
            }
            st.push(i); 
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        for (int days : result) {
            System.out.print(days + " ");
        }
    }
}

// To find: For each day, how many days to wait until a warmer temperature.
// steps:
// 1. Initialize a result array and a stack to keep track of indices.
// 2. Traverse the temperature array from the end to the beginning.
// 3. For each temperature, pop elements from the stack until finding a warmer temperature or the stack is empty.
// 4. If the stack is empty, set the result for that day to 0; otherwise, calculate the difference in indices to find the number of days to wait.
// 5. Push the current index onto the stack and continue to the next day.