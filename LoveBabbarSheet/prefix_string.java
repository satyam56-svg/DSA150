public class prefix_string {

        public String longestCommonPrefix(String[] arr) {

        if(arr == null || arr.length == 0)
            return "";

        String prefix = arr[0];   // first string as prefix

        for(int i = 1; i < arr.length; i++) {

            while(arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        prefix_string solution = new prefix_string();
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(arr)); // Output: "fl"
    }
}