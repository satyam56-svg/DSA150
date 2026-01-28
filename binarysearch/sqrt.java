// public class sqrt {

//     public static int mySqrt(int x) {

//         if(x==0 || x==1) return x;
//         int low=1,high=x/2,ans=0;

//         while(low<=high) {
//             int mid=low+(high-low)/2;
//             long sq=(long)mid*mid;

//             if(sq==x) {
//                 return mid;
//             } else if(sq<x) {
//                 ans=mid;
//                 low=mid+1;
//             } else {
//                 high=mid-1;
//             }
//         }

//         return ans;
//     }
//     public static void main(String[] args) {
//         int x = 8;
//         System.out.println("The square root of " + x + " is: " + mySqrt(x));
//     }
// }
