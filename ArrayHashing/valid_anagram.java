import java.util.HashMap; // HashMap import karna zaroori hai

public class valid_anagram {

    // Ye function ek string ka har character ka frequency count karta hai
    public static HashMap<Character,Integer> freq(String str) {
        HashMap<Character,Integer> mp = new HashMap<>(); // Naya HashMap banaya

        for(int i = 0; i < str.length(); i++) { // Har character pe loop chalao
            Character ch = str.charAt(i); // Current character nikalo

            // Agar character pehli baar aa raha hai
            if(!mp.containsKey(ch)) {
                mp.put(ch, 1); // Count 1 set karo
            } else {
                mp.put(ch, mp.get(ch) + 1); // Pehle se hai toh count badha do
            }
        }

        return mp; // Frequency map return karo
    }

    // Ye function check karega ki do strings anagram hai ya nahi
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; // Length alag hai toh anagram nahi ho sakte

        HashMap<Character,Integer> mp1 = freq(s); // Pehli string ka frequency map
        HashMap<Character,Integer> mp2 = freq(t); // Dusri string ka frequency map

        return mp1.equals(mp2); // Dono map same hai toh anagram hai
    }

    // Main function jahan se program start hota hai
    public static void main(String[] args) {
        String s = "listen"; // Pehli string
        String t = "silent"; // Dusri string

        // Result print karo
        if(isAnagram(s, t)) {
            System.out.println("Anagram hai"); // Agar anagram hai
        } else {
            System.out.println("Anagram nahi hai"); // Agar anagram nahi hai
        }
    }
}