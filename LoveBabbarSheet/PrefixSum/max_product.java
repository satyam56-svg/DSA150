// public class max_product {
//     public static int maxProduct(int[] arr) {
//         int maxProd = arr[0];
//         int minProd = arr[0];
//         int result = arr[0];
        
//         for (int i = 1; i < arr.length; i++) {
//             int temp = Math.max(arr[i], 
//                                Math.max(arr[i] * maxProd, 
//                                        arr[i] * minProd));
            
//             minProd = Math.min(arr[i], 
//                               Math.min(arr[i] * maxProd, 
//                                        arr[i] * minProd));
            
//             maxProd = temp;
//             result = Math.max(result, maxProd);
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 3, -2, 4};
//         System.out.println(maxProduct(arr));
//     }
// }
