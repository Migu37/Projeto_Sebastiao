package ENTITY;

public class Setor {
	private int codSetor = 0;
	private String nomSetor;
	private int quantSetor=0;
	
	public Setor(String nomSetor) {
		this.nomSetor = nomSetor;
		
	}

	public String getNomSetor() {
		return nomSetor;
	}

	public void setNomSetor(String nomSetor) {
		this.nomSetor = nomSetor;
	}

	public int getQuantSetor() {
		return quantSetor;
	}

	public void setQuantSetor(int quantSetor) {
		this.quantSetor = quantSetor;
	}

	public int getCodSetor() {
		return codSetor;
	}

}
