import java.util.PriorityQueue;

public class kClosest {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (a,b)->Integer.compare(b[0],a[0])
        );

        for(int i=0; i<points.length; i++) {
            int x=points[i][0];
            int y=points[i][1];

            int dist=x*x+y*y;

            pq.add(new int[]{dist,i});

            if(pq.size()>k) {
                pq.poll();
            }
        }

        int result[][]=new int[k][2];
        int idx=0;
        while(!pq.isEmpty()) {
            int pidx=pq.poll()[1];
            result[idx++]=points[pidx];
        }

        return result;
    }

    public static void main(String[] args) {
        int points[][]={{1,3},{-2,2}};
        int k=1;

        int result[][]=kClosest(points,k);

        for(int i=0; i<result.length; i++) {
            System.out.println("["+result[i][0]+","+result[i][1]+"]");
        }
    }
}
