// public class no_of_triangle {
//     public static int numberOfTriangles(int n, int[][] g) {

//         int count = 0;

//         for(int i = 0; i < n; i++) {

//             for(int j = 0; j < n; j++) {

//                 for(int k = 0; k < n; k++) {

//                     if(i != j && j != k && i != k) {

//                         if(g[i][j] == 1 && g[j][k] == 1 && g[k][i] == 1) {
//                             count++;
//                         }
//                     }
//                 }
//             }
//         }

//         return count / 3;   // directed cycle counted 3 times
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         int[][] g = {{0, 1, 1, 0},
//                      {0, 0, 1, 1},
//                      {1, 0, 0, 1},
//                      {0, 0, 0, 0}};

//         System.out.println(numberOfTriangles(n, g));
//     }
// }
