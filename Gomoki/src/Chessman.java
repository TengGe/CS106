package game.wuzi;
public enum Chessman {
	BLACK("¡ñ"), WHITE("¡ð");
	private String chessman;
	Chessman (String chessman) {
		this.chessman = chessman;
	}
	//»ñÈ¡Æå×Ó
	public String getChessman() {
		return chessman;
	}
}
