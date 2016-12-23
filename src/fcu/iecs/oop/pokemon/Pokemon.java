package fcu.iecs.oop.pokemon;

public class Pokemon {

	private String nickName;
	private PokemonType type;
	private int cp;
	
	public Pokemon(String nickName, PokemonType type, int cp) {
		super();
		this.nickName = nickName;
		this.type = type;
		this.cp = cp;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public PokemonType getType() {
		return type;
	}
	
	
	
}
