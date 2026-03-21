import java.util.Arrays;

public class fractional_knap {
    public static class Item {
        int value, weight;
        double ratio;
        
        Item(int v, int w) {
            value = v;
            weight = w;
            ratio = (double) v / w;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        
        Item[] items = new Item[n];
        
        for(int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }
        
        // Sort descending by ratio
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        
        double maxValue = 0.0;
        int currCap = capacity;
        
        for(int i = 0; i < n; i++) {
            if(currCap >= items[i].weight) {
                maxValue += items[i].value;
                currCap -= items[i].weight;
            } else {
                maxValue += items[i].ratio * currCap;
                break;
            }
        }
        
        return maxValue;
    }

    public static void main(String[] args) {
        fractional_knap fk = new fractional_knap();
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;
        
        double result = fk.fractionalKnapsack(val, wt, capacity);
        System.out.println("Maximum value in Knapsack = " + result);
    }
}