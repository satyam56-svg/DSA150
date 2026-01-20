class sortColors {
    public static void sortColors(int[] arr) {

        // Dutch National Flag Algorithm
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            // Evaluate the element at mid
            switch (arr[mid]) {

                // arr[mid] == 0
                case 0 ->                     {
                    
                    // Swap arr[low] and arr[mid]
                        int temp = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp;
                        low++;
                        mid++;
                    }
                case 1 -> mid++;
                default ->                     {
                        // arr[mid] == 2
                        int temp = arr[mid];
                        arr[mid] = arr[high];
                        arr[high] = temp;
                        high--;
                    }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
