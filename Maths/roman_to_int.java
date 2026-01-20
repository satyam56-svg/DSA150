import java.util.HashMap;
import java.util.Map;

public class roman_to_int {
    public static int romanToInt(String s) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total=0;
        int prevValue=0;

        for(int i=s.length()-1; i>=0; i--) {
            int currValue=map.get(s.charAt(i));

            if(currValue<prevValue) {
                total-=currValue;
            } else {
                total+=currValue;
                prevValue = currValue;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Example input
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}
