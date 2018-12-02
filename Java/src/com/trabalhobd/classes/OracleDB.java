package com.trabalhobd.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDB {
	Connection connection;
	Clinica c;

	public OracleDB(Clinica c) {
		this.c = c;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "nelson", "pass");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean success() {
		return connection != null;
	}

	public void populateClinica() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("SELECT * from MEDICOS");
		while (resultset.next()) {
			Integer id = Integer.parseInt(resultset.getString("medicos_id"));
			String nome = resultset.getString("nome");
			String morada = resultset.getString("morada");
			String especialidade = resultset.getString("especialidade");
			Medico m = new Medico(id, nome, morada, especialidade);
			c.addMedico(m);
		}

		resultset = statement.executeQuery("SELECT * from Users");
		while (resultset.next()) {
			Integer id = Integer.parseInt(resultset.getString("user_id"));
			String nome = resultset.getString("nome");
			String morada = resultset.getString("morada");
			String telefone = resultset.getString("telefone");
			String username = resultset.getString("username");
			String password = resultset.getString("password");
			String email = resultset.getString("email");
			Utilizador u = new Utilizador(id, nome, morada, telefone, username,
					password, email);
			c.addUtilizador(u);
		}

		resultset = statement.executeQuery("SELECT * FROM tipo_analises");
		while (resultset.next()) {
			Integer id = Integer.parseInt(resultset
					.getString("tipo_analises_id"));
			String nome = resultset.getString("nome");
			TipoAnalise a = new TipoAnalise(id, nome);
			c.addTipoAnalise(a);
		}

		System.out.println("Tipo Consultas");
		resultset = statement.executeQuery("SELECT * from Tipo_Consultas");
		while (resultset.next()) {
			Integer id = Integer.parseInt(resultset
					.getString("tipo_consultas_id"));
			String nome = resultset.getString("nome");
			TipoConsulta a = new TipoConsulta(id, nome);
			c.addTipoConsulta(a);
		}

		resultset = statement.executeQuery("SELECT * from Tipo_Exames");
		while (resultset.next()) {
			Integer id = Integer
					.parseInt(resultset.getString("tipo_exame_id"));
			String nome = resultset.getString("nome");
			TipoExame a = new TipoExame(id, nome);
			c.addTipoExame(a);
		}

		resultset = statement.executeQuery("SELECT * from Tipo_Vacinas");
		while (resultset.next()) {
			Integer id = Integer.parseInt(resultset
					.getString("tipo_vacinas_id"));
			String nome = resultset.getString("nome");
			TipoVacina a = new TipoVacina(id, nome);
			c.addTipoVacina(a);
		}

		statement.close();
	}

	public void close() throws SQLException {
		connection.close();
	}

}