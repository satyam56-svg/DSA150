import java.util.Arrays;

public class min_Platform {
    public static int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;
        int platforms = 0, maxPlatforms = 0;

        while(i < arr.length && j < dep.length) {
            if(arr[i] <= dep[j]) {
                platforms++;   // train aayi
                i++;
            } else {
                platforms--;   // train gayi
                j++;
            }

            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Minimum number of platforms required: " + minPlatform(arr, dep));
    }
}
