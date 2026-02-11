import java.util.ArrayList;
import java.util.HashMap;

public class find_miss_repeat {

    public static ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        
        for(int num:arr) {
            if(!map.containsKey(num)) {
                map.put(num,1);
            } else {
                map.put(num,map.get(num)+1);
            }
        }
        
        for(var e: map.entrySet()) {
            if(e.getValue()>1) {
                list.add(e.getKey());
            }
        }
        
        for(int i=1; i<=n; i++) {
            if(!map.containsKey(i)) {
                list.add(i);
            }
        }
        
        return list;
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,5,3};
        ArrayList<Integer>result=findTwoElement(arr);
        System.out.println("Missing number: "+result.get(1));
        System.out.println("Repeating number: "+result.get(0));
    }
}