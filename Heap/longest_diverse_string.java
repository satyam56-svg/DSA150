import java.util.PriorityQueue;

public class longest_diverse_string {
    public static String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (x,y)->y[0]-x[0]
        );
        
        if(a>0) pq.add(new int[]{a,'a'});
        if(b>0) pq.add(new int[]{b,'b'});
        if(c>0) pq.add(new int[]{c,'c'});

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()) {
            int first[]=pq.poll();
            int len=sb.length();

            if(len>=2 && sb.charAt(len-1)==first[1] && sb.charAt(len-2)==first[1]) {
                if(pq.isEmpty()) break;
                int second[]=pq.poll();
                sb.append((char)second[1]);
                second[0]--;
                if(second[0]>0) pq.add(second);
                pq.add(first);
            } else {
                sb.append((char)first[1]);
                first[0]--;
                if(first[0]>0) pq.add(first);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int a = 1, b = 1, c = 7;
        System.out.println(longestDiverseString(a, b, c)); // Example usage
    }
}

// to find: longest diverse string such that no three consecutive characters are the same
// steps:
// 1. Priority Queue to store counts of 'a', 'b', 'c'
// 2. Initial letters dalna
// 3. String builder to build the result
// 4. loop until pq is empty
// 5. sbse zyada count wala letter uthao
// 6. check if last two letters are same as current letter
// 7. if yes, then uthao second max letter and add to sb
// 8. if no, add current letter to sb
// 9. return sb.toString()