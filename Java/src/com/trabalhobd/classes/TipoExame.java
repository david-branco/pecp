package com.trabalhobd.classes;

public class TipoExame 
{
	private int tipoexame_id;
	private String nome;


	public TipoExame(int tipoexame_id, String nome) 
	{
		this.tipoexame_id = tipoexame_id;
		this.nome = nome;
	}
	
	public TipoExame(TipoExame e){
		this.tipoexame_id = e.gettipoexame_id();
		this.nome = e.getNome();
	}


	public int gettipoexame_id() {
		return tipoexame_id;
	}


	public void settipoexame_id(int tipoexame_id) {
		this.tipoexame_id = tipoexame_id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoExame clone(){
		return new TipoExame(this);
	}

	@Override
	public String toString() {
		return "TipoExame [tipoexame_id=" + tipoexame_id + ", nome=" + nome + "]";
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
		if (tipoexame_id != other.tipoexame_id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
	
	



