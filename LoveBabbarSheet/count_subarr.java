import java.util.Stack;

public class count_subarr {
    public static int countSubarrays(int arr[]) {
        int n = arr.length;
        int ans = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                ans += (n - i);
            } else {
                ans += (st.peek() - i);
            }

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 6, 2};
        System.out.println(countSubarrays(arr));
    }
}
