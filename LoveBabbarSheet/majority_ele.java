import java.util.HashMap;

public class majority_ele {
    public static int majorityElement(int arr[]) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        
        for(int num:arr) {
            if(!map.containsKey(num)) {
                map.put(num,1);
            } else {
                map.put(num,map.get(num)+1);
            }
        }
        
        for(var e:map.entrySet()) {
            if(e.getValue()>n/2) {
                return e.getKey();
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
