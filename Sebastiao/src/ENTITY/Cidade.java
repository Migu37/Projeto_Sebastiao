package ENTITY;

public class Cidade {
	private int codCidade;
	private String nomCidade;

	public Cidade(String nomCidade) {
		this.nomCidade = nomCidade;
		this.codCidade++;
	}

	public String getNomCidade() {
		return nomCidade ;
	}
	public void setNomCidadee(String nomCidade) {
		this.nomCidade = nomCidade;
	}
	public int getCodCidade() {
		return codCidade;
	}

}
