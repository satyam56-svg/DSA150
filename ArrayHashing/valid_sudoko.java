import java.util.*;

public class valid_sudoko {
	// Helper function to check if a 1D array has duplicate digits (other than '.')
	public static boolean hasDuplicate(char[] arr) {
		HashSet<Character> set = new HashSet<>();
		for (char c : arr) {
			if (c == '.') continue;
			if (set.contains(c)) return true; // Duplicate found
			set.add(c);
		}
		return false;
	}

	public static boolean isValidSudoku(char[][] board) {
		// Check all rows
		for (int i = 0; i < 9; i++) {
			char[] row = new char[9];
			System.arraycopy(board[i], 0, row, 0, 9);
			if (hasDuplicate(row)) return false;
		}

		// Check all columns
		for (int j = 0; j < 9; j++) {
			char[] col = new char[9];
			for (int i = 0; i < 9; i++)
				col[i] = board[i][j];
			if (hasDuplicate(col)) return false;
		}

		// Check all 3x3 boxes
		for (int block = 0; block < 9; block++) {
			char[] blockArr = new char[9];
			int idx = 0;
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++)
					blockArr[idx++] = board[3 * (block / 3) + i][3 * (block % 3) + j];
			if (hasDuplicate(blockArr)) return false;
		}

		// If no duplicates found, it's a valid Sudoku board
		return true;
	}

	public static void main(String[] args) {
		char[][] board = {
			{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			{'4', '.', '9', '8', '.', '3', '.', '.', '1'},
			{'7', '.', '.', '2', '.', '5', '.', '.', '.'},
			{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};

		System.out.println(isValidSudoku(board)); // Output: true

		// Example of an invalid Sudoku board
		char[][] invalidBoard = {
			{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
			{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			{'8', '.', '.', '.', '6', '.', '.', '5', '3'}, // Duplicate '5' in the row/box
			{'4', '.', '9', '8', '.', '3', '.', '.', '1'},
			{'7', '.', '.', '2', '.', '5', '.', '.', '.'},
			{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};
	   
		System.out.println(isValidSudoku(invalidBoard)); // Output: false
	}
}
