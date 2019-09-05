package com.br.multa2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.br.multa2.confg.Conectar;
import com.br.multa2.model.Infracao;



public class InfracaoDAO {
	
	public Infracao buscar(String num_placa) throws Exception {
		Conectar con = new Conectar();
		Connection c = con.getConexao();
		Statement stmt = c.createStatement();

		String sql = ("SELECT * FROM multas WHERE num_placa = '" + num_placa + "'");
		ResultSet res = stmt.executeQuery(sql);
		Infracao infracao = new Infracao();
		while (res.next()) {
			infracao.setId(res.getInt("id"));
			infracao.setPropritario(res.getString("propritario"));
			infracao.setCpf(res.getString("cpf"));
			infracao.setCod_renavan(res.getString("cod_renavan"));
			infracao.setNum_placa(res.getString("num_placa"));
			infracao.setMarcamodelo(res.getString("marcamodelo"));
			infracao.setMunicipio(res.getString("municipio"));
			infracao.setInfracao(res.getString("infracao"));
			infracao.setData_infracao(res.getString("data_infracao"));
			infracao.setHora_infracao(res.getString("hora_infracao"));
			infracao.setValor_infracao(res.getString("valor_infracao"));
			infracao.setSituacao_multa(res.getString("situacao_multa"));


		}

		return infracao;
	}
	
	public Infracao buscarRenavan(String cod_renavan) throws Exception {

		Conectar con = new Conectar();
		Connection c = con.getConexao();
		Statement stmt = c.createStatement();

		String sql = ("SELECT * FROM multas WHERE cod_renavan = " + cod_renavan);
		ResultSet res = stmt.executeQuery(sql);
		Infracao infracao = new Infracao();
		while (res.next()) {
			infracao.setId(res.getInt("id"));
			infracao.setPropritario(res.getString("propritario"));
			infracao.setCpf(res.getString("cpf"));
			infracao.setCod_renavan(res.getString("cod_renavan"));
			infracao.setNum_placa(res.getString("num_placa"));
			infracao.setMarcamodelo(res.getString("marcamodelo"));
			infracao.setMunicipio(res.getString("municipio"));
			infracao.setInfracao(res.getString("infracao"));
			infracao.setData_infracao(res.getString("data_infracao"));
			infracao.setHora_infracao(res.getString("hora_infracao"));
			infracao.setValor_infracao(res.getString("valor_infracao"));
			infracao.setSituacao_multa(res.getString("situacao_multa"));

		}

		return infracao;

	}
	
	public boolean inserir(Infracao infracao) throws SQLException, Exception {
		try {
			Conectar con = new Conectar();
			Connection c = con.getConexao();
			Statement stmt = c.createStatement();

			String sql = "INSERT INTO multas VALUES(0,'" + infracao.getPropritario() + "','"
					+ infracao.getCpf() + "','" + infracao.getCod_renavan() + "','" + infracao.getNum_placa()
					+ "','" + infracao.getMarcamodelo() + "','" + infracao.getMunicipio() + "','"
					+ infracao.getInfracao() + "','" + infracao.getData_infracao() + "','"
					+ infracao.getHora_infracao() + "','" + infracao.getValor_infracao() + "','" + infracao.getSituacao_multa() + "')";
			stmt.executeUpdate(sql);

			// c.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}



}
