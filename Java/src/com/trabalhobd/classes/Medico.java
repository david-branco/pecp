package com.trabalhobd.classes;

public class Medico {
	private int medico_id;
	private String nome;
	private String morada;
	private String especialidade;

	public Medico(int medico_id, String nome, String morada,
			String especialidade) {
		this.medico_id = medico_id;
		this.nome = nome;
		this.morada = morada;
		this.especialidade = especialidade;
	}

	public Medico() {
		nome = null;
		morada = null;
		especialidade = null;
	}
	
	public Medico(Medico c){
		medico_id = c.getMedicoID();
		nome = c.getNome();
		morada = c.getMorada();
		especialidade = c.getEspecialidade();
	}

	public int getMedicoID() {
		return medico_id;
	}

	public String getNome() {
		return nome;
	}

	public String getMorada() {
		return morada;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setMedicoID(int medico_id) {
		this.medico_id = medico_id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String toString() {
		return "Medico [medico_id=" + medico_id + ", nome=" + nome
				+ ", morada=" + morada + ", especialidade=" + especialidade
				+ "]";
	}
	
	public Medico clone(){
		return new Medico(this);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (medico_id != other.medico_id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
