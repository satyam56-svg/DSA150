import java.util.*;

public class largest_area_rectangle {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()]; // nikali hui bar ki height
                int width = stack.isEmpty() ? i : i - stack.peek() - 1; // width nikalna
                maxArea = Math.max(maxArea, height * width); // area calculate
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights)); // Output: 10
    }
}

// to find: largest rectangle area in histogram using stack approach

// steps:
// 1. Initialize a stack to keep track of indices of the histogram bars.
// 2. Iterate through each bar in the histogram, and for each bar:  
//    a. While the current bar is shorter than the bar at the index stored at the top 
//     of the stack, pop the stack and calculate the area of the rectangle that can be formed 
//      with the popped bar as the shortest bar.
//    b. Calculate the width of the rectangle using the current index 
//      and the index of the new top of the stack after popping.
//    c. Update the maximum area if the calculated area is larger.
// 3. Push the current index onto the stack.
// 4. After processing all bars, return the maximum area found.

// DRY RUN EXAMPLE:
// Consider the histogram heights = [2, 1, 5, 6, 2, 3]
// - Start with an empty stack and maxArea = 0.
// - Iterate through each bar:
//   i = 0, height = 2: Push index 0 onto the stack. Stack = [0]
//   i = 1, height = 1: Pop index 0 (height 2). Calculate area = 2 * 1 = 2. Update maxArea = 2. Push index 1. Stack = [1]
//   i = 2, height = 5: Push index 2 onto the stack. Stack = [1, 2]
//   i = 3, height = 6: Push index 3 onto the stack. Stack = [1, 2, 3]
//   i = 4, height = 2: Pop index 3 (height 6). Calculate area = 6 * 1 = 6. Update maxArea = 6. Pop index 2 (height 5). Calculate area = 5 * 2 = 10
//     Update maxArea = 10. Push index 4. Stack = [1, 4]
//   i = 5, height = 3: Push index 5 onto the stack
// - After processing all bars, the maximum area found is 10.