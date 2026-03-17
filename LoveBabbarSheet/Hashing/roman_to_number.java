import java.util.HashMap;

public class roman_to_number {
    public static int romanToDecimal(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int num = 0;

        int i = s.length() - 1;

        while(i > 0) {

            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i-1);

            if(map.get(ch1) > map.get(ch2)) {
                num += map.get(ch1) - map.get(ch2);
                i -= 2;
            } else {
                num += map.get(ch1);
                i--;
            }
        }

        // single character ya leftover first character
        if(i == 0) {
            num += map.get(s.charAt(0));
        }

        return num;
    }

    public static void main(String[] args) {
        String s = "MCMIV";
        System.out.println(romanToDecimal(s)); // Output: 1904
    }
}
