import java.util.HashSet;

public class unoccupied_computers {
    public static int solve(int n, String s) {

        HashSet<Character> using = new HashSet<>();
        HashSet<Character> rejected = new HashSet<>();

        int occupied = 0;
        int walkAway = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // arrival (first time seen)
            if (!using.contains(ch) && !rejected.contains(ch)) {

                if (occupied < n) {
                    using.add(ch);
                    occupied++;
                } else {
                    rejected.add(ch);
                    walkAway++;
                }
            }
            // departure
            else {

                if (using.contains(ch)) {
                    using.remove(ch);
                    occupied--;
                }
            }
        }

        return walkAway;
    }

    public static void main(String[] args) {
        int n = 2;
        String s = "ABBAJJKZKZ";

        System.out.println(solve(n, s));
    }
}
