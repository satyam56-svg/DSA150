public class merge_sort {
    public static void mergeSort(int arr[], int l, int r) {
        if(l < r) {
            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = 0;
        int temp[] = new int[high - low + 1];

        while(i <= mid && j <= high) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= high) {
            temp[k++] = arr[j++];
        }

        for(int p = low, q = 0; p <= high; p++, q++) {
            arr[p] = temp[q];
        }
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array is:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
