package binarysearch;
import java.util.Arrays;
public class median_sorted_arr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newArray[]=new int[nums1.length+nums2.length];

        System.arraycopy(nums1, 0, newArray, 0, nums1.length);

        int j=0;
        for(int i=nums1.length; i<nums2.length+nums1.length; i++) {
            newArray[i]=nums2[j++];
        }

        Arrays.sort(newArray);
        int size=newArray.length;
        if(size%2!=0) {
            return newArray[size/2];
        } else {
            return (newArray[(size/2)-1]+newArray[(size/2)])/2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }
}

// STEPS:
// 1. create a newArray with size arr1.length+arr2.length
// 2. copy all both array in a newArray
// 3. Arrays.sort(newArray)
// 4. if size of newArray%2 is not equal to zero, return newArray[size/2];
// 5. else return newArray[(size/2)-1]+newArray[(size/2)]/2.0;