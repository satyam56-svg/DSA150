import java.util.Arrays;

public class sort_by_setBit_count {
    public static void sortBySetBitCount(Integer arr[], int n) {
        // Your code goes here
        
        Arrays.sort(arr,(a,b)->{
            int countA=Integer.bitCount(a);
            int countB=Integer.bitCount(b);
            
            return countB-countA;
        });
    }

    public static void main(String[] args) {
        Integer arr[] = {5, 3, 9, 1, 7};
        int n = arr.length;
        
        sortBySetBitCount(arr, n);
        
        System.out.println("Sorted array based on set bit count:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
