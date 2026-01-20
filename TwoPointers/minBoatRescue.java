import java.util.Arrays;

public class minBoatRescue {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int count = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; // lightest person goes with heaviest
            }
            j--; // heaviest always goes (either alone or with someone)
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println("Minimum number of boats required: " + numRescueBoats(people, limit)); // Output: 3
    }
}
