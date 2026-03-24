import java.util.ArrayList;
import java.util.Collections;

public class max_meetings {    
    public static class Meeting {
        int start, end, pos;
        
        Meeting(int s, int e, int p) {
            start = s;
            end = e;
            pos = p;
        }
    }
    
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        
        ArrayList<Meeting> meetings = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
            meetings.add(new Meeting(S[i], F[i], i + 1));
        }
        
        Collections.sort(meetings, (a, b) -> a.end - b.end);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int lastEnd = -1;
        
        for(Meeting m : meetings) {
            if(m.start > lastEnd) {
                list.add(m.pos);
                lastEnd = m.end;
            }
        }
        
        // 🔥 IMPORTANT FIX
        Collections.sort(list);
        
        return list;
    }

    public static void main(String[] args) {
        int N = 6;
        int[] S = {1, 3, 0, 5, 8, 5};
        int[] F = {2, 4, 6, 7, 9, 9};
        
        ArrayList<Integer> result = maxMeetings(N, S, F);
        System.out.println(result); // Output: [1, 2, 4, 5]
    }
}