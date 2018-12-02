/** 
 * ConnectOracle.java 
 */
package com.javaworkspace.connectoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectOracle {

	public static void main(String[] args) 
	{
		try {
			Clinica c = new Clinica();
			Medico m = new Medico();
			
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			System.out.println("Connecting to the database...");
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "nelson", "pass");
			
			if(connection != null)
				System.out.println("Connected");
			
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("SELECT * from MEDICOS");
			while (resultset.next()) 
			{
				Integer id = Integer.parseInt(resultset.getString("medicos_id"));
				String nome = resultset.getString("nome");
				String morada = resultset.getString("morada");
				String especialidade = resultset.getString("especialidade");
				m = new Medico(id,nome,morada,especialidade);
				c.addMedico(m);
				System.out.println(m.toString());
			}
			System.out.println("Exit");
			statement.close();
			connection.close();
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}