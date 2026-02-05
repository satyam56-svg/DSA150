import java.util.HashMap;

public class count_of_occur {
    public static int countOccurence(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int count=0;
        
        for(int num:arr) {
            if(!map.containsKey(num)) {
                map.put(num,1);
            } else {
                map.put(num,map.get(num)+1);
            }
        }
        
        for(var e: map.entrySet()) {
            if(e.getValue()>n/k) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        int result = countOccurence(arr, k);
        System.out.println("Count of elements occurring more than n/k times: " + result);
    }
}
