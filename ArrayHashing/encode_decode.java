import java.util.*;

public class encode_decode {

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            String s = str.substring(j + 1, j + 1 + length);
            res.add(s);
            i = j + 1 + length;
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> original = Arrays.asList("hello", "world", "this", "is", "a", "test");
        String encoded = encode(original);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);

        System.out.println("Original and Decoded are equal: " + original.equals(decoded));
    }
}

// STEPS:
// Encodes a list of strings to a single string..
// 1. create a string builder sb..
// 2. run a for loop in all strings..
// 3. sb.append(s.length().append('#').append(s))..
// 4. return sb.toString()..
// Decodes a string to a list of strings..
// 5. create a ArrayList(res)..
// 6. initialse i=0..
// 7. run a while loop(outer loop) jb tk i<str.length
// 8. initialse j=i..
// 9. run a while loop(inner loop) jb tk str.charAt(j)!='#' to j++
// 10. Extract length of substring
// 11. Extract actual string of given length and add to res..
// 12. move pointer i to next substring start
// 13. return res..