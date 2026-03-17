// public class partition {
//     public static void threeWayPartition(int arr[], int a, int b) {
//         int n = arr.length;
//         int low = 0;      // next position for < a
//         int mid = 0;      // current element index  
//         int high = n - 1; // next position for > b
        
//         while(mid <= high) {
//             if(arr[mid] < a) {
//                 // Swap with low and increment both
//                 swap(arr, low, mid);
//                 low++;
//                 mid++;
//             }
//             else if(arr[mid] > b) {
//                 // Swap with high and decrement high only
//                 swap(arr, high, mid);
//                 high--;
//             }
//             else {
//                 // a <= arr[mid] <= b, move forward
//                 mid++;
//             }
//         }
//     }
    
//     public static  void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
//         int a = 14;
//         int b = 20;
        
//         threeWayPartition(arr, a, b);
        
//         // Print the partitioned array
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }
