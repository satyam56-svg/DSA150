import java.util.HashSet;

public class remove_duplicates {
    public static String removeDuplicates(String s) {
        HashSet<Character>set=new HashSet<>();
        String res="";
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                res+=ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(removeDuplicates(s)); // Output: "helo wrd"
    }
}
