package ENTITY;

public class Profissao {
private int codProfissao=0;
private String nomProfissao;

public Profissao(String nomProf) {
	this.nomProfissao = nomProf;
	this.codProfissao++;
}

public String getNomProfissao() {
	return nomProfissao;
}
public void setNomProfissao(String nomProfissao) {
	this.nomProfissao = nomProfissao;
}
public int getCodProfissao() {
	return codProfissao;
}
}
