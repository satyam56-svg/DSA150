import java.util.HashSet;

public class sub_arr_sum {
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> seen = new HashSet<>();
        int sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum == 0 || seen.contains(sum)) {
                return true;
            }
            seen.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};
        System.out.println(findsum(arr));
    }
}
