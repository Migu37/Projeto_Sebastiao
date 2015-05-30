package ENTITY;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConexaoBD.Conexao;


public class Pessoa {
	private int codPessoa;
	private String nome;
	private String sobrenome;
	private String RG;	
	private String CPF;
	private String  dat_nascimento;
	private	String sexo;	
	private Profissao profissao;
	private String grauIntrucao;
	private String estadoCivil;
	private String religiao;
	private Endereco endereco;
	private String tel;
	private String nomPai;	
	private String nomMae;
	private String setor;
	private String datCadastro;
	private String datConfirmacao;
	private String datCasamento;
	private String datBatismo;
	private String idade;
	
	public Pessoa(int codPessoa, String nome, String sobrenome, String rG,
			String cPF, String dat_nascimento, String sexo,
			Profissao profissao, String grauIntrucao, String estadoCivil,
			String religiao, Endereco endereco, String tel, String nomPai,
			String nomMae, String setor, String datCadastro,
			String datConfirmacao, String datCasamento, String datBatismo,
			String idade) {
		super();
		this.codPessoa = codPessoa;
		this.nome = nome;
		this.sobrenome = sobrenome;
		RG = rG;
		CPF = cPF;
		this.dat_nascimento = dat_nascimento;
		this.sexo = sexo;
		this.profissao = profissao;
		this.grauIntrucao = grauIntrucao;
		this.estadoCivil = estadoCivil;
		this.religiao = religiao;
		this.endereco = endereco;
		this.tel = tel;
		this.nomPai = nomPai;
		this.nomMae = nomMae;
		this.setor = setor;
		this.datCadastro = datCadastro;
		this.datConfirmacao = datConfirmacao;
		this.datCasamento = datCasamento;
		this.datBatismo = datBatismo;
		this.idade = idade;
	}
	

	public Pessoa(String nome, String sobrenome) {
		super();
		this.codPessoa++;
		this.nome = nome;
		this.sobrenome = sobrenome;
		
	}
	public Pessoa(int cod){
		this.codPessoa = cod;
		
	}


	public Pessoa( String c) {
	this.CPF = c;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getDat_nascimento() {
		return dat_nascimento;
	}

	public void setDat_nascimento(String dat_nascimento) {
		this.dat_nascimento = dat_nascimento;
	}

	public String isSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public String getGrauIntrucao() {
		return grauIntrucao;
	}

	public void setGrauIntrucao(String grauIntrucao) {
		this.grauIntrucao = grauIntrucao;
	}

	public String isEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNomPai() {
		return nomPai;
	}

	public void setNomPai(String nomPai) {
		this.nomPai = nomPai;
	}

	public String getNomMae() {
		return nomMae;
	}

	public void setNomMae(String nomMae) {
		this.nomMae = nomMae;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getDatCadastro() {
		return datCadastro;
	}

	public void setDatCadastro(String datCadastro) {
		this.datCadastro = datCadastro;
	}

	public String getDatConfirmacao() {
		return datConfirmacao;
	}

	public void setDatConfirmacao(String datConfirmacao) {
		this.datConfirmacao = datConfirmacao;
	}

	public String getDatCasamento() {
		return datCasamento;
	}

	public void setDatCasamento(String datCasamento) {
		this.datCasamento = datCasamento;
	}

	public String getDatBatismo() {
		return datBatismo;
	}

	public void setDatBatismo(String datBatismo) {
		this.datBatismo = datBatismo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public int getCodPessoa() {
		return codPessoa;
	}
	
	public Pessoa maiorCodigo() {
		Conexao CF = new Conexao();
		Pessoa saida = null;
		try(Connection conexao = CF.abrirConexao()){
		PreparedStatement PS = conexao.prepareStatement("SELECT MAX(codigo) FROM clientes");
		ResultSet RS = PS.executeQuery();
		if(RS.next()){
			int cod = RS.getInt("max(codigo)")+1;
			
			saida = new Pessoa(cod);
		}
		RS.close();
		PS.close();
		}catch(SQLException e){
			System.out.println(e);
		}		
		return saida;
		
	}

	
}
