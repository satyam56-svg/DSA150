import java.util.ArrayList;

public class seperatePosNeg {
    public static void segregateElements(int[] arr) {
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        
        int n=arr.length;
        
        for(int i=0; i<n; i++) {
            if(arr[i]>=0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        
        for(int i=0; i<pos.size(); i++) {
            arr[i]=pos.get(i);
        }
        
        int k=0;
        for(int i=pos.size(); i<n; i++) {
            arr[i]=neg.get(k++);
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 8, -2, 7};
        segregateElements(arr);
        printArray(arr);
    }
}
