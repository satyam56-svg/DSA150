import java.util.PriorityQueue;

public class reorganise_string {
    public static String reorganizeString(String s) {
        int n=s.length();
        int freq[]=new int[26];
        for(char ch: s.toCharArray()) {
            freq[ch-'a']++;
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->b[1]-a[1]
        );

        for(int i=0; i<26; i++) {
            if(freq[i]>0) {
                if(freq[i]>(n+1)/2) return  "";
                pq.add(new int[]{i,freq[i]});
            }
        }

        StringBuilder result = new StringBuilder();
        int prev[]=null;

        while(!pq.isEmpty()) {
            int curr[]=pq.poll();
            result.append((char)(curr[0]+'a'));
            curr[1]--;

            if(prev!=null && prev[1]>0) {
                pq.add(prev);
            }

            prev=curr;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbc";
        String reorganized = reorganizeString(s);
        if (reorganized.isEmpty()) {
            System.out.println("Not possible to reorganize the string.");
        } else {
            System.out.println("Reorganized string: " + reorganized);
        }
    }
}

// to find: reorganised string such that no two adjacent characters are same
// approach: max heap
// TC: O(n log k) , SC: O(k) where k is number of unique characters
// example: aaabbc -> abacab
// example: aaab -> ""

// steps:
// 1. calculate frequency of each character
// 2. add all characters with their frequency to max heap
// 3. poll two most frequent characters and append to result
// 4. decrease their frequency and add back to heap if frequency > 0
// 5. repeat until heap is empty
// 6. if at any point frequency of a character is more than (n+1)/2, return ""
// 7. return the result string

// dry run: aaabbc
// freq: a-3, b-2, c-1
// max heap: [(a,3), (b,2), (c,1)]
// result: ""
// poll (a,3) -> result: "a", (a,2)
// poll (b,2) -> result: "ab", (b,1), add (a,2) back to heap
// max heap: [(a,2), (c,1), (b,1)]
// poll (a,2) -> result: "aba", (a,1)
// poll (c,1) -> result: "abac", (c,0),
// add (a,1) back to heap
// max heap: [(a,1), (b,1)]
// poll (a,1) -> result: "abaca", (a,0)
// poll (b,1) -> result: "abacab", (b,0)
// heap is empty, return "abacab"

