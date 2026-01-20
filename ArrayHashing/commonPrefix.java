public class commonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0)
            return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals(""))
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(arr)); // output: "fl"
    }
}

// STEPS:
// 1. agar str.length==0 ho to khali string return kro..
// 2. Initialse String prefix=strs[0];
// 3. run a outer loop(for loop) from i=1 to i<strs.length;
// 4. run a inner loop(while loop) jab tak current string prefix se start nhi
// hoti
// 5. prefix ko chota krte jao
// 6. Last me prefix ko return krdo