// package Searching;
// import java.util.ArrayList;

// public class first_last_occ {
//     public static ArrayList<Integer> find(int arr[], int x) {

//         ArrayList<Integer> list = new ArrayList<>();

//         int first = firstOcc(arr, x);
//         int last = lastOcc(arr, x);

//         list.add(first);
//         list.add(last);

//         return list;
//     }

//     public static int firstOcc(int arr[], int x) {

//         int low = 0;
//         int high = arr.length - 1;
//         int ans = -1;

//         while(low <= high) {

//             int mid = (low + high) / 2;

//             if(arr[mid] == x) {
//                 ans = mid;
//                 high = mid - 1;   // LEFT me search
//             }
//             else if(arr[mid] < x) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }

//         return ans;
//     }

//     public static int lastOcc(int arr[], int x) {

//         int low = 0;
//         int high = arr.length - 1;
//         int ans = -1;

//         while(low <= high) {

//             int mid = (low + high) / 2;

//             if(arr[mid] == x) {
//                 ans = mid;
//                 low = mid + 1;   // RIGHT me search
//             }
//             else if(arr[mid] < x) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         int arr[] = {1, 2, 3, 4, 4, 4, 5, 6};
//         int x = 4;

//         ArrayList<Integer> ans = find(arr, x);

//         System.out.println(ans);
//     }
// }
