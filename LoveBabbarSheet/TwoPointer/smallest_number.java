public class smallest_number {
    public static String smallestNumber(int s, int d) {
        
        // impossible cases
        if(s == 0) {
            return (d == 1) ? "0" : "-1";
        }
        
        if(s > 9 * d) return "-1";

        int[] res = new int[d];

        // reserve 1 for first digit
        s = s - 1;

        // fill from right
        for(int i = d - 1; i > 0; i--) {
            if(s > 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }

        // remaining goes to first digit
        res[0] = s + 1;

        // convert to string
        StringBuilder sb = new StringBuilder();
        for(int num : res) {
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int s = 20;
        int d = 3;
        String result = smallestNumber(s, d);
        System.out.println(result); // Output: "299"
    }
}
