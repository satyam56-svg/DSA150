// package Sorting;
// public class merge_heap {
//     public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
//         // your code here
//         int merged[]=new int[n+m];
        
//         System.arraycopy(a, 0, merged, 0, n);
//         System.arraycopy(b, 0, merged, n, m);
        
//         int n1=merged.length;
//         for(int i=(n1/2)-1; i>=0; i--) {
//             heapify(merged,n1,i);
//         }
        
//         return merged;
//     }
    
//     public static void heapify(int arr[], int n, int i) {
//         int largest=i;
//         int left=2*i+1;
//         int right=2*i+2;
        
//         if(left<n && arr[left]>arr[largest]) {
//             largest=left;
//         }
        
//         if(right<n && arr[right]>arr[largest]) {
//             largest=right;
//         }
        
//         if(largest!=i) {
//             int temp=arr[i];
//             arr[i]=arr[largest];
//             arr[largest]=temp;
            
//             heapify(arr,n,largest);
//         }
//     }

//     public static void main(String[] args) {
//         int[] a = {10, 9, 8};
//         int[] b = {7, 6, 5};
//         int n = a.length;
//         int m = b.length;

//         int[] mergedHeap = mergeHeaps(a, b, n, m);
//         System.out.println("Merged Max Heap:");
//         for (int num : mergedHeap) {
//             System.out.print(num + " ");
//         }
//     }
// }
