import java.util.ArrayList;
import java.util.HashSet;

public class union_of_array {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a)
            set.add(x);
        for (int x : b)
            set.add(x);
        return new ArrayList<>(set);  // ✅ O(1) conversion
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={3,4,5,6};

        ArrayList<Integer> list = findUnion(a, b);
        
        System.out.print("Union: ");
        for(int x : list) {
            System.out.print(x + " ");
        }
    }
}
