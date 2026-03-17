public class remove_cons_char {

    public String removeConsecutiveCharacter(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            // first character always add
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        remove_cons_char obj = new remove_cons_char();
        String s = "aaabbbcc";
        String result = obj.removeConsecutiveCharacter(s);
        System.out.println(result); // Output: "abc"
    }
}