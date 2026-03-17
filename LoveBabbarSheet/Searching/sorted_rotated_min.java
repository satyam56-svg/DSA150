public class sorted_rotated_min {
    public static int findMin(int[] arr) {
        // code here
        int low=0;
        int high=arr.length-1;
        
        while(low<high) {
            int mid=low+(high-low)/2;
            
            if(arr[mid]>arr[high]) {
                low=mid+1;
            } else {
                high=mid;
            }
        }
        
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(arr);
        System.out.println("The minimum element in the sorted rotated array is: " + min);
    }
}
