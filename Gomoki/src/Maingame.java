package game.wuzi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Maingame {
	private int posX, posY;
	boolean isOver = false;
	final int WIN_SIZE = 5;
	Chessboard a = new Chessboard();
	BufferedReader lay = new BufferedReader(new InputStreamReader(System.in));
	String str;
	//主游戏
	public void GoGame() {
		a.initBoard();
		while (!isOver) {
			System.out.println("请输入要下棋子坐标：");
			try {
				str = lay.readLine();
			}catch (IOException e){
				e.printStackTrace();
			}
			try {
				String[] arrays=str.split(",");
				posX = Integer.parseInt(arrays[0]);
				posY = Integer.parseInt(arrays[1]);
			} catch (Exception e) {
				a.printBoard();
				System.out.println("请以（数字,数字）的方式输入");
				continue;
			}
			//是否合法
			if (!isVaild()) {
				continue;
			}
			String chessman=Chessman.BLACK.getChessman();
			a.setBoard(posX, posY, chessman);
			//是否赢了
			if (isWon(chessman)) {
				//是否重玩
				if (isAgain(chessman)) {
					GoGame();
				}else {
					isOver = true;
					continue;
				}
			}
			a.printBoard();
			System.out.println("电脑开始下棋");
			//电脑下棋
			computerDo();
			chessman=Chessman.WHITE.getChessman();
			a.setBoard(posX, posY, chessman);
			//是否赢了
			if (isWon(chessman)) {
				//是否重玩
				if (isAgain(chessman)) {
					GoGame();
				}else {
					isOver = true;
					continue;
				}
			}
			a.printBoard();
			System.out.println("玩家开始下棋");

		}
		System.out.println("游戏结束");
	}
	//输入是否合法
	private boolean isVaild() {
		if (posX<0 || posX>=a.SIZE || posY<0 || posY>=a.SIZE) {
			a.printBoard();
			System.out.println("您输入的坐标只能在0-22之间，请重新输入");
			return false;
		}
		String[][] board = a.getBoard();
		if (board[posX][posY] != "╂") {
			a.printBoard();
			System.out.println("该地方已经有棋子了，请重新输入");
			return false;
		}
		return true;
	}
	//是否赢棋
	private boolean isWon(String ico) {
		int temp;
		int num = 0;
		String[][] board=a.getBoard();
		temp= posX-WIN_SIZE+1;
		int posMinX = (temp<0 ? 0:temp);
		temp= posX+WIN_SIZE-1;
		int posMaxX = (temp>(a.SIZE-1) ? a.SIZE-1 : temp);
		temp= posY-WIN_SIZE+1;
		int posMinY = (temp<0 ? 0:temp);
		temp= posY+WIN_SIZE-1;
		int posMaxY = (temp>(a.SIZE-1) ? a.SIZE-1 : temp);
		//左右是否连五子
		for (int i=posMinY; i<posMaxY; i++) {
			if (board[posX][i]==ico && board[posX][i+1]==ico) {
				num++;
			}else if (num != WIN_SIZE-1) {
				num = 0;
			}
		}
		if (num == WIN_SIZE-1)
			return true;
		//上下是否连五子
		for (int i=posMinX; i<posMaxX; i++) {
			if (board[i][posY]==ico && board[i+1][posY]==ico) {
				num++;
			}else if (num != WIN_SIZE-1) {
				num = 0;
			}
		}
		if (num == WIN_SIZE-1)
			return true;
		//左上到右下是否连五子
		for (int i=posMinX, j=posMinY; i<posMaxX && j<posMaxY; i++,j++) {
			if (board[i][j]==ico && board[i+1][j+1]==ico) {
				num++;
			}else if (num != WIN_SIZE-1) {
				num = 0;
			}
		}
		if (num == WIN_SIZE-1)
			return true;
		//右上到左下是否连五子
		for (int i=posMinX, j=posMaxY; i<posMaxX && j>posMinY; i++, j--) {
			if (board[i][j]==ico && board[i+1][j-1]==ico) {
				num++;
			}else if (num != WIN_SIZE-1) {
				num = 0;
			}
		}
		if (num == WIN_SIZE-1)
			return true;
		return false;
	}
	//是否重玩
	private boolean isAgain(String ico) {
		String again = new String();
		a.printBoard();
		System.out.println((ico==Chessman.BLACK.getChessman() ? "恭喜您，您赢了！" :"抱歉，您输了！"));
		System.out.println("是否重新下棋(y/n)");
		try {
			again= lay.readLine();
		} catch (IOException e) {
		}
		if (again.equals("y"))
			return true;
		return false;
		
	}
	private void computerDo() {
		String[][] board = a.getBoard();
		posX = (int)(Math.random()*(a.SIZE-1));
		posY = (int)(Math.random()*(a.SIZE-1));
		while (board[posX][posY] != "╂") {
			posX = (int)(Math.random()*(a.SIZE-1));
			posY = (int)(Math.random()*(a.SIZE-1));
		}
	}
	public static void main(String[] args) {
		Maingame ma= new Maingame();
		ma.GoGame();
	}
}
