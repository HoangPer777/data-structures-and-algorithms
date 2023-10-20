package Task2;

public class Advance_2_4 {
	
	private static final char EMPTY = ' ';
	private char[][] board;
	
	public boolean checkRows() {
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j <= board.length - 3; j++) {
				if(board[i][j] == board[i][j+1] && board[i][j+1] == board[i][j+2] && board[i][j+1] != EMPTY ) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean checkColumns() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j <= board.length - 3; j++) {
				if (board[j][i] == board[j + 1][i] && board[j + 1][i] == board[j + 2][i] && board[j + 2][i] != EMPTY) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean checkDiagonals() {
		for (int i = 0; i < board.length - 2; i++) {
			if (board[i][i] == board[i + 1][i + 1] && board[i + 1][i + 1] == board[i + 2][i + 2]
					&& board[i + 2][i + 2] != EMPTY) {
				return true;
			}
		}
		
		for (int i = 0; i < board.length - 2; i++) {
			if (board[i][(board.length - 1) - i] == board[i + 1][(board.length - 1) - i - 1] && board[i + 1][(board.length - 1) - i - 1] == board[i + 2][(board.length - 1) - i - 2]
					&& board[i + 2][(board.length - 1) - i - 2] != EMPTY) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Advance_2_4 ticTacToe = new Advance_2_4();
		char chessboard[][] = { {'o', 'x', 'o', 'x', 'x', 'x'}, 
								{'x', 'x', 'x', 'x', 'x', 'x'}, 
								{'x', 'x', 'o', 'x', 'x', 'o'}, 
								{'o', 'x', 'o', 'x', 'o', 'x'}, 
								{'x', 'o', 'x', 'x', 'o', 'x'}, 
								{'x', 'x', 'o', 'o', 'x', 'x'}};
		ticTacToe.board = chessboard;
		System.out.println(ticTacToe.checkRows());
		System.out.println(ticTacToe.checkColumns());
		System.out.println(ticTacToe.checkDiagonals());
	}
}
