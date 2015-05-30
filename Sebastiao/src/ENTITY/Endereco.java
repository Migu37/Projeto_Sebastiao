package ENTITY;
public class Endereco {
	static private int totalDeEendereco =0;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String UF;
	private String CEP;

public Endereco(String rua,int numero,String bairro,String cidade,String UF, String CEP){
	
	this.rua = rua;
	this.numero = numero;
	this.bairro = bairro;
	this.cidade =cidade;
	this.UF=UF;
	this.CEP=CEP;
	this. totalDeEendereco++; 
	}
public String toString(){
	String saida="";
	saida+="rua: "+this.rua;
	
	saida+="\nnumero: "+this.numero;
	if(this.numero!=Util.leInt("")){
		saida+=this.rua;
	}else{
		saida+="null";
	}	
	saida+="\nbairro: "+this.bairro;
	saida+="\ncidade: "+this.cidade;
	saida+="\nUF: "+this.UF;
	saida+="\nCEP: "+this.CEP;
	return saida;		
}

}