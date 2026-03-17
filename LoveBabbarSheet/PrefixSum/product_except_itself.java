// public class product_except_itself {
//         public static int[] productExceptSelf(int arr[]) {

//         int n = arr.length;
//         int res[] = new int[n];

//         res[0] = 1;

//         // left product
//         for(int i = 1; i < n; i++) {
//             res[i] = res[i-1] * arr[i-1];
//         }

//         int right = 1;

//         // right product
//         for(int i = n-1; i >= 0; i--) {
//             res[i] = res[i] * right;
//             right *= arr[i];
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4};
//         int result[] = productExceptSelf(arr);

//         for(int i : result) {
//             System.out.print(i + " ");
//         }
//         // Output: 24 12 8 6
//     }
// }