package game.wuzi;
public enum Chessman {
	BLACK("��"), WHITE("��");
	private String chessman;
	Chessman (String chessman) {
		this.chessman = chessman;
	}
	//��ȡ����
	public String getChessman() {
		return chessman;
	}
}
