package com.javaworkspace.connectoracle;

public class TipoExame 
{
	private int medico_id;
	private String nome;


	public TipoExame(int medico_id, String nome) 
	{
		this.medico_id = medico_id;
		this.nome = nome;
	}


	public int getMedico_id() {
		return medico_id;
	}


	public void setMedico_id(int medico_id) {
		this.medico_id = medico_id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "TipoExame [medico_id=" + medico_id + ", nome=" + nome + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoExame other = (TipoExame) obj;
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
	
	



