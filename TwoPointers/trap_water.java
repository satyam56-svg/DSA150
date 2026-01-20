public class trap_water {
    public static int maxArea(int[] arr) {
        int i=0,j=arr.length-1;
        int maxArea=0;
        while(i<j) {
            int currArea=(j-i)*Math.min(arr[i],arr[j]);
            if(arr[i]<arr[j]) i++;
            else j--;
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum area of water that can be trapped: " + maxArea(arr));
    }
}
