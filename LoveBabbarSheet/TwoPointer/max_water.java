// public class max_water {
//     public static int maxWater(int arr[]) {
//         int n=arr.length;
//         if(n<3) return 0;
        
//         int left=0,right=n-1;
//         int leftMax=0,rightMax=0;
//         int water=0;
        
//         while(left<right) {
//             leftMax=Math.max(leftMax,arr[left]);
//             rightMax=Math.max(rightMax,arr[right]);
            
//             if(leftMax<rightMax) {
//                 water+=leftMax-arr[left];
//                 left++;
//             } else {
//                 water+=rightMax-arr[right];
//                 right--;
//             }
//         }
        
//         return water;
//     }

//     public static void main(String[] args) {
//         int arr[]={3,0,2,0,4};
//         System.out.println(maxWater(arr));
//     }
// }
