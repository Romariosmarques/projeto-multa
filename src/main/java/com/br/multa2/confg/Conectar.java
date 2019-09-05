package com.br.multa2.confg;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
	
	public Connection getConexao() throws Exception {
		try {
			String server = "localhost";
			String port = "3306"; // Porta TCP padrão do MySQL
			String database = "sistema_multas";

			String user = "root";
			String passwd = "";

			String url = "jdbc:mysql://" + server + ":" + port + "/" + database;

			// Abre-se a conexão com o Banco de Dados
			Connection con = DriverManager.getConnection(url, user, passwd);

			return con;

		} catch (Exception erro) {
			throw new Exception(erro);
		}

	}


}
