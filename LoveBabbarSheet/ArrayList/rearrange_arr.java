import java.util.ArrayList;

public class rearrange_arr {

    public static void Rearrange(int a[], int n) {
        ArrayList<Integer>neg=new ArrayList<>();
        ArrayList<Integer>pos=new ArrayList<>();
        for(int num:a) {
            if(num<0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }
        
        for(int i=0; i<neg.size(); i++) {
            a[i]=neg.get(i);
        }
        
        for(int i=0; i<pos.size(); i++) {
            a[i+neg.size()]=pos.get(i);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, -2, 3, -4, 5, -6};
        Rearrange(a, a.length);
        for(int num : a) {
            System.out.print(num + " ");
        }
    }
}