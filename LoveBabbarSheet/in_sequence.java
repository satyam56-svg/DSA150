public class in_sequence {
    public static int inSequence(int a, int b, int c) {
        // code here
        for(int i=a; i<=b; i+=c) {
            if(i==b) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a=1, b=10, c=2;
        System.out.println(inSequence(a,b,c));
    }
}
