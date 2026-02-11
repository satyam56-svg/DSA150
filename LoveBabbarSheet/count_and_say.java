public class count_and_say {
    public static String countAndSay(int n) {
        // code here
        String result="1";
        for(int i=2; i<=n; i++) {
            StringBuilder temp = new StringBuilder();
            int count=1;
            
            for(int j=1; j<result.length(); j++) {
                if(result.charAt(j)==result.charAt(j-1)) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(result.charAt(j-1));
                    count=1;
                }
            }
            
            temp.append(count);
            temp.append(result.charAt(result.length()-1));
            result=temp.toString();
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }
}
