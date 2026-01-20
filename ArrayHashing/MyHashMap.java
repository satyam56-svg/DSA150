public class MyHashMap {
    int[] map;

    public MyHashMap() {
        map = new int[1000001];  // key range 0 to 10^6
        for (int i = 0; i < 1000001; i++) {
            map[i] = -1;  // initially no key exists
        }
    }

    public void put(int key, int value) {
        map[key] = value;  // assign value to key
    }

    public int get(int key) {
        return map[key];  // return value or -1 if not found
    }

    public void remove(int key) {
        map[key] = -1;  // remove the key by resetting to -1
    }

    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();
        obj.put(5, 50);
        obj.put(10, 100);
        System.out.println(obj.get(5));   // 50
        obj.remove(5);
        System.out.println(obj.get(5));   // -1
        System.out.println(obj.get(10));  // 100
    }
}
