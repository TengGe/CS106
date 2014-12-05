package game.wuzi;
public class Chessboard {
	private String[][] board;
	final int SIZE = 22;
	//���̳�ʼ��
	public void initBoard() {
		board = new String[SIZE][SIZE];
		for (int i= 0; i< SIZE; i++)
			for (int j=0; j< SIZE; j++)
				board[i][j] = "��";
	}
	//��ӡ����
	public void printBoard() {
		for (int i=0; i<SIZE; i++) {
			for (int j=0; j<SIZE; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	//��������
	public void setBoard(int posX, int posY, String chessman) {
		board[posX][posY] = chessman;
	}
	public String[][] getBoard() {
		return board;
	}
}
