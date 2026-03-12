// package TwoPointer;

// import java.util.ArrayList;

// public class Union_2sorted_arr {
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         int i = 0, j = 0;

//         while(i < a.length && j < b.length) {

//             if(a[i] < b[j]) {
//                 if(list.isEmpty() || list.get(list.size()-1) != a[i])
//                     list.add(a[i]);
//                 i++;
//             }
//             else if(a[i] > b[j]) {
//                 if(list.isEmpty() || list.get(list.size()-1) != b[j])
//                     list.add(b[j]);
//                 j++;
//             }
//             else {
//                 if(list.isEmpty() || list.get(list.size()-1) != a[i])
//                     list.add(a[i]);
//                 i++;
//                 j++;
//             }
//         }

//         while(i < a.length) {
//             if(list.isEmpty() || list.get(list.size()-1) != a[i])
//                 list.add(a[i]);
//             i++;
//         }

//         while(j < b.length) {
//             if(list.isEmpty() || list.get(list.size()-1) != b[j])
//                 list.add(b[j]);
//             j++;
//         }

//         return list;
//     }

//     public static void main(String[] args) {
//         int a[] = {1, 2, 4, 5, 6};
//         int b[] = {2, 3, 5, 7};

//         ArrayList<Integer> list = findUnion(a, b);
//         for(int i : list)
//             System.out.print(i + " ");
//     }
// }
