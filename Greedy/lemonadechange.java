public class lemonadechange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills1 = {5, 5, 5, 10, 20};
        int[] bills2 = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bills1)); // true
        System.out.println(lemonadeChange(bills2)); // false
    }
}

// STEPS:
// 1. initialse five=0 and ten=0..
// 2. pure bills array me traverse kro..
// 3. if bill==5 ho to five++..
// 4. else if bill==10, if five==0 return false, five--,ten++..
// 5. else, if ten>0 && five>0 ho to ten--,five--, else if five>=3 five-=3, else return false..
// 6. return true..