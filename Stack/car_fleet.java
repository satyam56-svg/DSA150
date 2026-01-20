import java.util.*;

public class car_fleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2]; // [position, time]

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) / speed[i];
        }

        // Sort DESCENDING by position (cars[0][0] = closest to target)
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        int target = 12;
        int[] position = { 10, 8, 0, 5, 3 };
        int[] speed = { 2, 4, 1, 1, 3 };
        System.out.println(carFleet(target, position, speed)); // Output: 3
    }
}

// to find: number of car fleets that will arrive at the target

// steps:
// 1. Create a 2D array to store each car's position and time to reach the
// target
// 2. Sort the cars based on their starting positions in descending order
// 3. Use a stack to keep track of the fleets based on their arrival times
// 4. If a car's time to reach the target is greater than the time of
// the car in front of it, it forms a new fleet
// 5. Return the size of the stack as the number of car fleets

// Example:
// Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
// Output: 3
// Explanation:
// The cars starting at positions 10 and 8 form a fleet and arrive at the target
// at the same time. The car starting at position 0 arrives alone. The cars
// starting at positions 5 and 3 form another fleet and arrive together.
// Time Complexity: O(n log n) due to sorting
