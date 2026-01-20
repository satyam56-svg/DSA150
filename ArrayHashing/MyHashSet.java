public class MyHashSet {
    static boolean[] set = new boolean[1000001]; // static array

    public static void add(int key) {
        set[key] = true;
    }

    public static void remove(int key) {
        set[key] = false;
    }

    public static boolean contains(int key) {
        return set[key];
    }

    public static void main(String[] args) {
        add(5);
        add(10);
        System.out.println(contains(5));  // true
        remove(5);
        System.out.println(contains(5));  // false
        System.out.println(contains(10)); // true
    }
}
