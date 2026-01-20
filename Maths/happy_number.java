import java.util.HashSet;

public class happy_number {

    public static int power(int n) {    
        int t=n,sum=0;
        while(t!=0) {
            int digit=t%10;
            sum+=Math.pow(digit,2);
            t/=10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();    
        int result=power(n);    
        while(result!=1) {  
            if(set.contains(result)) {  
                return false;   
            } else {
                set.add(result);    
            }
            result=power(result);   
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 19; // Example input
        if (isHappy(n)) {
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
    }
}

// STEPS:
// 1. create a hashset named set
// 2. initialse result with value power(n)
// power(n): fun to calculate the sum of squares of digits.
// 3. loop untill we find a happy no or detect a cycle
// 4. if we have seen this no before, it means we are in a cycle, not a happy no
// 5. add the results to the set
// 6. calculate the next result
// 7. if we reach 1, it is a happy no