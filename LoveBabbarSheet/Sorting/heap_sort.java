// package Sorting;
// public class heap_sort {
//     public static void heapSort(int arr[]) {
//         int n = arr.length;

//         // build max heap
//         for(int i = n/2 - 1; i >= 0; i--) {
//             heapify(arr, n, i);
//         }

//         // extract elements
//         for(int i = n-1; i >= 0; i--) {
//             swap(arr, 0, i);
//             heapify(arr, i, 0);
//         }
//     }

//     public static void heapify(int arr[], int n, int i) {

//         int largest = i;
//         int left = 2*i + 1;
//         int right = 2*i + 2;

//         if(left < n && arr[left] > arr[largest]) {
//             largest = left;
//         }

//         if(right < n && arr[right] > arr[largest]) {
//             largest = right;
//         }

//         if(largest != i) {
//             swap(arr, largest, i);
//             heapify(arr, n, largest);
//         }
//     }

//     public static void swap(int arr[], int a, int b) {
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }

//     public static void main(String[] args) {
//         int arr[] = {12, 11, 13, 5, 6, 7};
//         heapSort(arr);
//         System.out.println("Sorted array is:");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
