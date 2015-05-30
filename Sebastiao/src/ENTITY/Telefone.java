package ENTITY;

public class Telefone {
	private int cod_tel = 0;
	private String tel_fixo;
	private String tel_cel;
	
	Telefone( String fixo,String cel){
		this.tel_cel = cel;
		this.tel_fixo = fixo;
		this.cod_tel++;			
		
	}
	
	public String getTel_fixo() {
		return tel_fixo;
	}
	public void setTel_fixo(String tel_fixo) {
		this.tel_fixo = tel_fixo;
	}
	public String getTel_cel() {
		return tel_cel;
	}
	public void setTel_cel(String tel_cel) {
		this.tel_cel = tel_cel;
	}
	public int getCod_tel() {
		return cod_tel;
	}

}
