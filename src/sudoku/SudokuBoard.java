package sudoku;

public class SudokuBoard {
	
	private Integer[][] sudokuBoard = new Integer[9][9];

	public SudokuBoard() {
	}

	public Integer getSudokuBoard(int row, int col) {
		return sudokuBoard[row][col];
	}

	public void setSudokuBoard(int row, int col, Integer board) {
		sudokuBoard[row][col] = board;
	}

	
	
}
