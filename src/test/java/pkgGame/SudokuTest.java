package pkgGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SudokuTest {

	@Test
	void constructor_test1() {
		// testing failures and exceptions being thrown
		int[][] incorrectPuzzle = {
				{1,2,3,4,5},
				{2,3,4,5,1},
				{1,2,3,4,5},
				{2,3,4,5,1},
				{1,2,3,4,5}
		};
		Assertions.assertThrows(Exception.class, () -> {
			Sudoku s = new Sudoku(5);
		});
		Assertions.assertThrows(Exception.class, () -> {
			Sudoku s = new Sudoku(incorrectPuzzle);
		});
	}
	@Test
	void constructor_test2() {
		//testing properly constructed objects
		Sudoku s;
		try {
			s = new Sudoku(9);
			Assertions.assertEquals(s.getPuzzle().length, 9);
		} catch (Exception e) {
			fail("Sudoku threw an exception it shouldn't have: " + e.getMessage());
		}
		int[][] correctPuzzle = {
				{1,2,3,4,5,1,2,3,4},
				{2,3,4,5,1,1,2,3,4},
				{1,2,3,4,5,1,2,3,4},
				{2,3,4,5,1,1,2,3,4},
				{1,2,3,4,5,1,2,3,4},
				{1,2,3,4,5,1,2,3,4},
				{2,3,4,5,1,1,2,3,4},
				{1,2,3,4,5,1,2,3,4},
				{1,2,3,4,5,1,2,3,4}
		};
		try {
			s = new Sudoku(correctPuzzle);
			Assertions.assertEquals(s.getPuzzle().length, 9);
		} catch (Exception e){
			fail("Sudoku threw an exception it shouldn't have: " + e.getMessage());
		}
	}
	
	@Test
	void getRegion_test1() {
		
	}

}
