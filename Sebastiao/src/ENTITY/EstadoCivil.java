package ENTITY;

public class EstadoCivil {
	private int cod_EstadoCivil;
	private String nom_EstadoCivil;
	public EstadoCivil(String nom_EstadoCivil) {

		this.nom_EstadoCivil = nom_EstadoCivil;
	}
	public String getNom_EstadoCivil() {
		return nom_EstadoCivil;
	}
	public void setNom_EstadoCivil(String nom_EstadoCivil) {
		this.nom_EstadoCivil = nom_EstadoCivil;
	}
	public int getCod_EstadoCivil() {
		return cod_EstadoCivil;
	}
}
