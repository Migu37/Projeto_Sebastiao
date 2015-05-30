package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ConexaoBD.Conexao;
import ENTITY.Cidade;
import ENTITY.Comunidade;
import ENTITY.Estado;
import ENTITY.EstadoCivil;
import ENTITY.InstrucaoEsc;
import ENTITY.Paroquia;
import ENTITY.Profissao;
import ENTITY.Setor;

public class ConexoesDAO {

	public static Connection con = new Conexao().abrirConexao();
	public ArrayList<EstadoCivil> selectEstadoCivil() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM estadocivil ORDER by nom_estCivil");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<EstadoCivil> listAll = new ArrayList<EstadoCivil>();
		try {

			while (Rs.next()) {

				String nom_estCivil = Rs.getString("nom_estCivil");
				EstadoCivil paro = new EstadoCivil(nom_estCivil);
				listAll.add(paro);

			}

			//con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}
	public ArrayList<Paroquia> selectParoquia() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM paroquia ORDER by nom_paroquia");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<Paroquia> listAll = new ArrayList<Paroquia>();
		try {

			while (Rs.next()) {

				String nom_Paroquia = Rs.getString("nom_Paroquia");
				Paroquia paro = new Paroquia(nom_Paroquia);
				listAll.add(paro);

			}

			//con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}

	public ArrayList<Cidade> selectCidade() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM cidade ORDER BY nom_Cidade");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<Cidade> listAll = new ArrayList<Cidade>();
		try {

			while (Rs.next()) {

				String nom_Cidade = Rs.getString("nom_Cidade");
				Cidade cid = new Cidade(nom_Cidade);
				listAll.add(cid);

			}

			// con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}

	public ArrayList<InstrucaoEsc> selectInstrucao() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM instrucao ORDER BY nom_Instrucao");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<InstrucaoEsc> listAll = new ArrayList<InstrucaoEsc>();
		try {

			while (Rs.next()) {

				String nom_Instrucao = Rs.getString("nom_Instrucao");
				InstrucaoEsc prof = new InstrucaoEsc(nom_Instrucao);
				listAll.add(prof);

			}

			// con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}

	public ArrayList<Profissao> selectProfissao() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM profissao ORDER BY nome_Prof");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<Profissao> listAll = new ArrayList<Profissao>();
		try {

			while (Rs.next()) {

				String nom_Prof = Rs.getString("nome_Prof");
				Profissao prof = new Profissao(nom_Prof);
				listAll.add(prof);

			}

			// con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}

	public ArrayList<Estado> selectEstado() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM estado ORDER BY nom_Estado");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<Estado> listAll = new ArrayList<Estado>();
		try {

			while (Rs.next()) {

				String nom_Prof = Rs.getString("nom_Estado");
				Estado prof = new Estado(nom_Prof);
				listAll.add(prof);

			}

			// con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}

	public ArrayList<Setor> selectSetor() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM setor ORDER BY nom_Setor");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<Setor> listAll = new ArrayList<Setor>();
		try {

			while (Rs.next()) {

				String nom_Prof = Rs.getString("nom_Setor");
				Setor prof = new Setor(nom_Prof);
				listAll.add(prof);

			}

			// con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}

	public ArrayList<Comunidade> selectComunidade() throws SQLException {

		ResultSet Rs = null;

		PreparedStatement Statement = con
				.prepareStatement("SELECT * FROM comunidade ORDER BY nom_Comunidade");
		Rs = Statement.executeQuery();// executa consulta

		ArrayList<Comunidade> listAll = new ArrayList<Comunidade>();
		try {

			while (Rs.next()) {

				String nom_Comunidade = Rs.getString("nom_Comunidade");
				Comunidade com = new Comunidade(nom_Comunidade);
				listAll.add(com);

			}

			// con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return listAll;
	}

}
