package ENTITY;

public class Paroquia {
	private int codParoquia;
	private String nomParoquia;
	public Paroquia(String nomParoquia) {		
		this.codParoquia++;
		this.nomParoquia = nomParoquia;
	}
	public String getNomParoquia() {
		return nomParoquia;
	}
	public void setNomParoquia(String nomParoquia) {
		this.nomParoquia = nomParoquia;
	}
	public int getCodParoquia() {
		return codParoquia;
	}
	

}
