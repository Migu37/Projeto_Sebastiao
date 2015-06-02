package DAO;
import iINTERFACE.Interface;

import java.sql.*;
import java.util.*;

import ENTITY.Pessoa;
import ConexaoBD.Conexao;

public  class MembroAcessoDados implements Interface{
	
	@SuppressWarnings("resource")
	public void salvar(Pessoa membro) {
		Connection conexao = new Conexao().abrirConexao();
		ResultSet rs = null;				
	
		try {
			
			 PreparedStatement Statement = conexao.prepareStatement("SELECT MAX(codPessoa) FROM pessoas");
	             rs = Statement.executeQuery();//executa consulta
	            rs.next(); //posiciona no primeiro registro
	            int codigo = rs.getInt(1)+1; //pega o maior codigo e soma 1	            
	            Statement = conexao.prepareStatement("INSERT INTO pessoa ( nome, sobreNome,CPF,RG) VALUES (?,?)"); //sql	podendo ser uma String         
	            Statement.setString(1, membro.getNome());													//que tenha esse código sql 
	            Statement.setString(2, membro.getSobrenome());                    							//e ai so passa a variavel String 
	            																							//aqui 
	            Statement.executeUpdate();
	            System.out.println("Registro inserido com sucesso");			
		} catch (SQLException e) {
			System.out.println("Erro ao incluir cliente. Mensagem: " + e.getMessage());
		} finally {
			try {
				 rs.close();
		            conexao.close();	
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operações de inserção. Mensagem: " + e.getMessage());
			}
		}
		
		
	}	
	@Override
	public List<Pessoa>listar(Pessoa p){
		return null;}
	@Override
	public Pessoa buscarRegistroCod(int n){
		return null;}
	@Override
	public Pessoa buscarRegistroNom(String nome){
		return null;}
	
	
	@Override
	public void atualizar(Pessoa membro) {
		Connection conexao = new Conexao().abrirConexao();
		PreparedStatement atualizaSt = null;

		String sql = "update cliente set nome=?";

		try {
			atualizaSt = conexao.prepareStatement(sql);
			atualizaSt.setString(1, membro.getNome());		
			atualizaSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar cliente. Mensagem: " + e.getMessage());
		} finally {
			try {
				atualizaSt.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operações de atualização. Mensagem: " + e.getMessage());
			}
		}
	}
	@Override
	public void excluir(Pessoa membro) {
		Connection conexao = new Conexao().abrirConexao();
		PreparedStatement excluiSt = null;

		String sql = "delete from cliente where codigo = ?";

		try {
			excluiSt = conexao.prepareStatement(sql);
			excluiSt.setInt(1, membro.getCodPessoa());
			excluiSt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao excluir cliente. Mensagem: " + e.getMessage());
		} finally {
			try {
				excluiSt.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operações de exclusão. Mensagem: " + e.getMessage());
			}
		}
	}/*

	public List<Pessoa> listar() {
		Connection conexao = new Conexao().abrirConexao();
		List<Pessoa> clientes = new ArrayList<Pessoa>();
		Statement consulta = null;
		ResultSet resultado = null;
		Pessoa cliente = null;

		String sql = "select * from cliente";

		try {
			consulta = conexao.createStatement();
			resultado = consulta.executeQuery(sql);

			while (resultado.next()) {
				cliente = new Pessoa();
				cliente.setId(resultado.getInt("codigo"));
				cliente.setNome(resultado.getString("nome"));
		
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar código do cliente. Mensagem: " + e.getMessage());
		} finally {
			try {
				consulta.close();
				resultado.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operações de consulta. Mensagem: " + e.getMessage());
			}
		}
		return clientes;
	}

	public Pessoa buscaRegistro(int valor) {
		Connection conexao = new Conexao().abrirConexao();
		PreparedStatement consulta = null;
		ResultSet resultado = null;
		Pessoa cliente = null;

		String sql = "select * from cliente where codigo = ?";

		try {
			consulta = conexao.prepareStatement(sql);
			consulta.setInt(1, valor);
			resultado = consulta.executeQuery();

			if (resultado.next()) {
				cliente = new Pessoa();
				cliente.setId(resultado.getInt("codigo"));
				cliente.setNome(resultado.getString("nome"));
				
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar código do cliente. Mensagem: " + e.getMessage());
		} finally {
			try {
				consulta.close();
				resultado.close();
				conexao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operações de consulta. Mensagem: " + e.getMessage());
			}
		}
		return cliente;
	}*/
	public int  maiorCodigo() {
		Conexao CF = new Conexao();
		int saida =0;
		try(Connection conexao = CF.abrirConexao()){
		PreparedStatement PS = conexao.prepareStatement("SELECT MAX(codPessoa) as Maior FROM pessoas");
		ResultSet RS = PS.executeQuery();
		
		if(RS.next()){
	
			saida = RS.getInt("Maior")+1;
			
			
		}
		RS.close();
		PS.close();
		}catch(SQLException e){
		
		}		
		return saida;
		
	}
	 
}



