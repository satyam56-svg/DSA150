// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

// public class hand_of_straight {
//     public static boolean isNStraightHand(int[] hand, int groupSize) {
//         // If total cards can't be divided evenly into groups
//         if (hand.length % groupSize != 0)
//             return false;

//         Arrays.sort(hand); // sort the hand
//         Map<Integer, Integer> freq = new HashMap<>();
//         for (int card : hand) {
//             freq.put(card, freq.getOrDefault(card, 0) + 1);
//         }

//         // Try to form groups starting from the smallest card
//         for (int card : hand) {
//             if (freq.get(card) == 0)
//                 continue; // already used

//             // Attempt to build a group of size groupSize
//             for (int i = 0; i < groupSize; i++) {
//                 int curr = card + i;
//                 if (freq.getOrDefault(curr, 0) == 0) {
//                     return false; // can't form group
//                 }
//                 freq.put(curr, freq.get(curr) - 1); // use one card
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int[] hand1 = {1, 2, 3, 6, 2, 3, 4, 7, 8};
//         int groupSize1 = 3;
//         System.out.println(isNStraightHand(hand1, groupSize1)); // true

//         int[] hand2 = {1, 2, 3, 4, 5};
//         int groupSize2 = 4;
//         System.out.println(isNStraightHand(hand2, groupSize2)); // false
//     }
// }

// // to find: whether a given hand of cards can be rearranged into groups of consecutive cards of a specified size.
// // steps:
// // 1. Check if the total number of cards is divisible by the group size.
// // 2. Sort the hand of cards.
// // 3. Use a frequency map to count occurrences of each card.
// // 4. Iterate through the sorted cards and try to form groups of the specified size.
// // 5. If a group cannot be formed at any point, return false.
// // 6. If all cards can be grouped successfully, return true.

// // Dry run(1):
// // Example: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
// // Sorted hand: [1,2,2,3,3,4,6,7,8]
// // Frequency map: {1:1, 2:2, 3:2, 4:1, 6:1, 7:1, 8:1}
// // Start with card 1:
// // - Form group [1,2,3], update freq: {1:0, 2:1, 3:1, 4:1, 6:1, 7:1, 8:1}
// // Next card 2:
// // - Form group [2,3,4], update freq: {1:0, 2:0, 3:0, 4:0, 6:1, 7:1, 8:1}
// // Next card 6:
// // - Form group [6,7,8], update freq: {1:0, 2:0, 3:0, 4:0, 6:0, 7:0, 8:0}
// // All cards used successfully, return true.

// // Dry run(2):
// // Example: hand = [1,2,3,4,5], groupSize = 4
// // Sorted hand: [1,2,3,4,5]
// // Frequency map: {1:1, 2:1, 3:1, 4:1, 5:1}
// // Start with card 1:
// // - Form group [1,2,3,4], update freq: {1:0, 2:0, 3:0, 4:0, 5:1}
// // Next card 5:
// // - Cannot form group [5,6,7,8] as 6,7,8 are not in freq
// // Return false.
