package com.trabalhobd.classes;

public class TipoConsulta {
	private int tipoconsulta_id;
	private String nome;

	public TipoConsulta(int tipoconsulta_id, String nome) {
		this.tipoconsulta_id = tipoconsulta_id;
		this.nome = nome;
	}
	
	public TipoConsulta(TipoConsulta c){
		this.tipoconsulta_id = c.getTipoconsulta_id();
		this.nome = c.getNome();
	}

	public int getTipoconsulta_id() {
		return tipoconsulta_id;
	}

	public String getNome() {
		return nome;
	}

	public void setTipoconsulta_id(int tipoconsulta_id) {
		this.tipoconsulta_id = tipoconsulta_id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "TipoConsulta [tipoconsulta_id=" + tipoconsulta_id + ", nome="
				+ nome + "]";
	}
	
	public TipoConsulta clone(){
		return new TipoConsulta(this);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoConsulta other = (TipoConsulta) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoconsulta_id != other.tipoconsulta_id)
			return false;
		return true;
	}

}
