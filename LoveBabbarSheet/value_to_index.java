import java.util.ArrayList;

public class value_to_index {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == i + 1) {
                res.add(arr[i]);   // ya res.add(i+1) dono same
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};

        ArrayList<Integer> ans = valueEqualToIndex(arr);

        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
