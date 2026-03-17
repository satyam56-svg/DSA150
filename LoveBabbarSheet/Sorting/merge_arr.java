// package Sorting;
// // package LoveBabbarSheet;

// // public class merge_arr {
// //     public static void mergeArrays(int a[], int b[]) {
// //         // Temporary array banao (sirf 1 extra line!)
// //         int[] temp = new int[a.length + b.length];
// //         int i = 0, j = 0, k = 0;

// //         // Standard merge (LeetCode 88 jaisa)
// //         while (i < a.length && j < b.length) {
// //             if (a[i] <= b[j])
// //                 temp[k++] = a[i++];
// //             else
// //                 temp[k++] = b[j++];
// //         }
// //         while (i < a.length)
// //             temp[k++] = a[i++];
// //         while (j < b.length)
// //             temp[k++] = b[j++];

// //         // Copy back - pehle n in a[], baki m in b[]
// //         for (int p = 0; p < a.length; p++)
// //             a[p] = temp[p];
// //         for (int p = 0; p < b.length; p++)
// //             b[p] = temp[a.length + p];
// //     }

// //     public static void printArray(int arr[]) {
// //         for(int i=0; i<arr.length; i++) {
// //             System.out.print(arr[i]+" ");
// //         }
// //         System.out.println();
// //     }

// //     public static void main(String[] args) {
// //         int a[]={0,2,5,6};
// //         int b[]={1,3,7,8,9};

// //         mergeArrays(a, b);
// //         printArray(a);
// //         printArray(b);
// //     }
// // }