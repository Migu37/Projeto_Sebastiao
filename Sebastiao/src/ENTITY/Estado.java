package ENTITY;

public class Estado {
	
	private int cod_Estado;
	private String nom_Estado;
	
	public Estado( String nom) {
		this.cod_Estado++;
		this.nom_Estado =nom;
	}

	public int getCod_Estado() {
		return cod_Estado;
	}

	public void setCod_Estado(int cod_Estado) {
		this.cod_Estado = cod_Estado;
	}

	public String getNom_Estado() {
		return nom_Estado;
	}

	public void setNom_Estado(String nom_Estado) {
		this.nom_Estado = nom_Estado;
	}

}
