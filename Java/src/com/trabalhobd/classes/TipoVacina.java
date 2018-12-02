package com.trabalhobd.classes;

public class TipoVacina {
	private int tipovacina_id;
	private String tipo;

	public TipoVacina(int tipovacina_id, String tipo) {
		this.tipovacina_id = tipovacina_id;
		this.tipo = tipo;
	}

	public TipoVacina(TipoVacina v) {
		this.tipovacina_id = v.getTipovacina_id();
		this.tipo = v.getTipo();
	}

	public int getTipovacina_id() {
		return tipovacina_id;
	}

	public void setTipovacina_id(int tipovacina_id) {
		this.tipovacina_id = tipovacina_id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public TipoVacina clone(){
		return new TipoVacina(this);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoVacina other = (TipoVacina) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (tipovacina_id != other.tipovacina_id)
			return false;
		return true;
	}

}
