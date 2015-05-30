package ENTITY;

public class Comunidade {
	private int codComunidade;
	private String nomComunidade;

	public Comunidade(String nomComunidade) {
		this.nomComunidade = nomComunidade;
		this.codComunidade++;
	}

	public String getNomComunidade() {
		return nomComunidade ;
	}
	public void setNomComunidade(String nomComunidade) {
		this.nomComunidade = nomComunidade;
	}
	public int getCodComunidade() {
		return codComunidade;
	}

}
