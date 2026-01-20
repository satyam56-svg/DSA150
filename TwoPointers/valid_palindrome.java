public class valid_palindrome {
    // Ye function check karta hai ki string palindrome hai ya nahi
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Sabko lowercase karo aur non-alphanumeric hatao
        int i = 0, j = s.length() - 1; // Do pointer le lo - ek start se, ek end se
        while(i < j) { // Jab tak i < j hai
            if(s.charAt(i) != s.charAt(j)) { // Agar dono character alag hai
                return false; // Palindrome nahi hai
            }
            i++; // i aage badhao
            j--; // j peeche lao
        }
        return true; // Palindrome hai
    }

    // Main function jahan se program start hota hai
    public static void main(String[] args) {
        valid_palindrome solution = new valid_palindrome(); // valid_palindrome object banaya
        String s = "A man, a plan, a canal: Panama"; // Example string

        // Result print karo
        if(solution.isPalindrome(s)) {
            System.out.println("Palindrome hai"); // Agar palindrome hai
        } else {
            System.out.println("Palindrome nahi hai"); // Agar palindrome 
        }
    }
}