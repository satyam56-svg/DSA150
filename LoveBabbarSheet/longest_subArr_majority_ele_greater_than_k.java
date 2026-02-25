import java.util.HashMap;

public class longest_subArr_majority_ele_greater_than_k {

    public static int longestSubarray(int[] arr, int k) {
        int n=arr.length;
        int maxLen=0;
        int sum=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<n; i++) {
            if(arr[i]>k) {
                sum+=1;
            } else {
                sum-=1;
            }
            
            if(sum>0) maxLen=i+1;
            
            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
            
            if(map.containsKey(sum-1)) {
                int prevIndex=map.get(sum-1);
                maxLen=Math.max(maxLen,i-prevIndex);
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        System.out.println(longestSubarray(arr,k));
    }
}