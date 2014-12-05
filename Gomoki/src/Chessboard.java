package game.wuzi;
public class Chessboard {
	private String[][] board;
	final int SIZE = 22;
	//棋盘初始化
	public void initBoard() {
		board = new String[SIZE][SIZE];
		for (int i= 0; i< SIZE; i++)
			for (int j=0; j< SIZE; j++)
				board[i][j] = "╂";
	}
	//打印棋盘
	public void printBoard() {
		for (int i=0; i<SIZE; i++) {
			for (int j=0; j<SIZE; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	//设置棋子
	public void setBoard(int posX, int posY, String chessman) {
		board[posX][posY] = chessman;
	}
	public String[][] getBoard() {
		return board;
	}
}
