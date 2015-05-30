package ENTITY;

public class InstrucaoEsc {
	private int codIntrucao;
	private String nomInstrucao;
	public InstrucaoEsc(String nomInstrucao) {

		this.nomInstrucao = nomInstrucao;
		codIntrucao++;
	}
	public String getNomInstrucao() {
		return nomInstrucao;
	}
	public void setNomInstrucao(String nomInstrucao) {
		this.nomInstrucao = nomInstrucao;
	}
	public int getCodIntrucao() {
		return codIntrucao;
	}

}
