public class mergeAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int n1 = word1.length();
        int n2 = word2.length();
        
        StringBuilder str = new StringBuilder();

        // Add alternate characters
        while (i < n1 && j < n2) {
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }

        // Add remaining characters from word1
        while (i < n1) {
            str.append(word1.charAt(i++));
        }

        // Add remaining characters from word2
        while (j < n2) {
            str.append(word2.charAt(j++));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}
