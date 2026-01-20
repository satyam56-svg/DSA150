public class container_with_most_water {
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
        System.out.println(maxArea(arr)); // Output: 49
    }
}

// STEP:
/*
1. initialse kro i=0 and j=arr.length-1;
2. maxarea ko bhi initialse kro 0 se
3. while loop chlao jiski condition(i<j) ho
4. hr ek interval me currArea=(j-i)*Math.min(arr[i],arr[j])
5. agr arr[i] se arr[j] se bda ho then i++ nhi to j--
6. maxArea=Math.max(currArea,maxArea)
7. return maxArea
*/
