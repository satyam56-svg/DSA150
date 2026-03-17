// public class median1 {
//     public static double medianOf2(int[] a, int[] b) {
//         int[] arr = new int[a.length + b.length];
//         int i = 0, j = 0, k = 0;
//         // Copy both arrays (no merge logic needed)
//         while (i < a.length) arr[k++] = a[i++];
//         while (j < b.length) arr[k++] = b[j++];
//         java.util.Arrays.sort(arr);  // Add this: O((m+n)log(m+n))
        
//         int n = arr.length;
//         if (n % 2 != 0) return arr[n / 2];
//         return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
//     }

//     public static void main(String[] args) {
//         int a[] = {1,2,9,5};
//         int b[] = {2,8,6,7};
//         System.out.println(medianOf2(a, b));  // Outputs: 5.0
//     }
// }
