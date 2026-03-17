// package Sorting;
// public class count_Inversion {
//     static int inversionCount(int arr[]) {
//         return mergeSort(arr, 0, arr.length - 1);
//     }

//     static int mergeSort(int arr[], int left, int right) {
//         int count = 0;
//         if (left < right) {
//             int mid = (left + right) / 2;

//             count += mergeSort(arr, left, mid);
//             count += mergeSort(arr, mid + 1, right);
//             count += merge(arr, left, mid, right);
//         }
//         return count;
//     }

//     static int merge(int arr[], int left, int mid, int right) {
//         int i = left, j = mid + 1, k = 0;
//         int temp[] = new int[right - left + 1];
//         int count = 0;

//         while (i <= mid && j <= right) {
//             if (arr[i] <= arr[j]) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//                 count += (mid - i + 1);
//             }
//         }

//         while (i <= mid) temp[k++] = arr[i++];
//         while (j <= right) temp[k++] = arr[j++];

//         for (i = left; i <= right; i++) {
//             arr[i] = temp[i - left];
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 20, 6, 4, 5};
//         System.out.println("Number of inversions are: " + inversionCount(arr));
//     }
// }
