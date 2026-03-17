import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class unique_row {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        // add code here.
        LinkedHashSet<List<Integer>>set=new LinkedHashSet<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        for(int i=0; i<r; i++) {
            ArrayList<Integer>list=new ArrayList<>();
            for(int j=0; j<c; j++) {
                list.add(a[i][j]);
            }
            set.add(list);
        }
        
        for(List<Integer>num:set) {
            ans.add(new ArrayList<>(num));
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 1, 0}, {1, 0, 0}, {1, 1, 0}, {0, 0, 0}};
        int r = 4;
        int c = 3;
        ArrayList<ArrayList<Integer>> result = uniqueRow(a, r, c);
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}
