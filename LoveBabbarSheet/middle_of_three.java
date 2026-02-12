public class middle_of_three {
    public static int middle(int a, int b, int c) {

        int big = Math.max(a, Math.max(b, c));
        int small = Math.min(a, Math.min(b, c));

        return a + b + c - big - small;
    }

    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        System.out.println(middle(a, b, c));
    }
}
