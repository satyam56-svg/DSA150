import java.util.ArrayList;
import java.util.Arrays;

public class four_Sum {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {

        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum == target) {

                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);

                        res.add(temp);

                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1])
                            left++;
                        while (left < right && arr[right] == arr[right + 1])
                            right--;
                    }

                    else if (sum < target) {
                        left++;
                    }

                    else {
                        right--;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        ArrayList<ArrayList<Integer>> result = fourSum(arr, target);

        for (ArrayList<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
