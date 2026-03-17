public class search_rot_arr {
    static int Search(int array[], int k) {

        int low = 0;
        int high = array.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            // element mil gaya
            if(array[mid] == k) {
                return mid;
            }

            // LEFT part sorted hai
            if(array[low] <= array[mid]) {

                if(k >= array[low] && k < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            // RIGHT part sorted hai
            else {

                if(k > array[mid] && k <= array[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;

        int ans = Search(array, k);

        if(ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + ans);
        }
    }
}
