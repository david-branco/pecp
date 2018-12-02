package com.trabalhobd.classes;

import java.io.Serializable;

public class Utilizador implements Serializable {
	private int utilizador_id;
	private String nome;
	private String morada;
	private String telefone;
	private String username;
	private String email;
	private String password;

	public Utilizador() {
	}

	public Utilizador(int cUtilizadorID, String cNome, String cMorada, String cTelefone,
			String cUsername, String cEmail, String cPassword) {
		utilizador_id = cUtilizadorID;
		nome = cNome;
		morada = cMorada;
		telefone = cTelefone;
		username = cUsername;
		email = cEmail;
		password = cPassword;

	}

	public Utilizador(Utilizador u) {
		utilizador_id = u.getUtilizadorID();
		nome = u.getNome();
		morada = u.getMorada();
		telefone = u.getTelefone();
		username = u.getUsername();
		email = u.getEmail();
		password = u.getPassword();
	}

	// Get's
	public int getUtilizadorID() {
		return this.utilizador_id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getUsername() {
		return this.username;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	// Set's
	public void setUtilizadorID(int cUtilizadorID) {
		utilizador_id = cUtilizadorID;
	}

	public void setNome(String cNome) {
		nome = cNome;
	}

	public void setTelefone(String cTelefone) {
		telefone = cTelefone;
	}

	public void setUsername(String cUsername) {
		username = cUsername;
	}

	public void setEmail(String cEmail) {
		email = cEmail;
	}

	public void setPassword(String cPassword) {
		password = cPassword;
	}

	// Clone
	public Utilizador clone() {
		return new Utilizador(this);
	}

	// To String
	public String toString() {
		StringBuilder s = new StringBuilder("------ Utilizador ---------  \n");
		s.append("ID: " + utilizador_id + "\n");
		s.append("Nome: " + nome + "\n");
		s.append("Telefone: " + telefone + "\n");
		s.append("Username: " + username + "\n");
		s.append("Email: " + email + "\n");
		s.append("Password: " + password + "\n");

		return s.toString();
	}

	// Equals
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if ((o == null) || (this.getClass() != o.getClass()))
			return false;

		Utilizador umUtilizador = (Utilizador) o;

		return (this.utilizador_id == umUtilizador.getUtilizadorID()
				&& this.nome.equals(umUtilizador.getNome()) && this.username
					.equals(umUtilizador.getUsername()));
	}
}