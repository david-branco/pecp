package com.javaworkspace.connectoracle;

public class TipoAnalise 
{
	private int tipoanalise_id;
	private String tipo;
	
	public TipoAnalise(int tipoanalise_id, String tipo) 
	{
		this.tipoanalise_id = tipoanalise_id;
		this.tipo = tipo;
	}

	public int getTipoanalise_id() {
		return tipoanalise_id;
	}

	public void setTipoanalise_id(int tipoanalise_id) {
		this.tipoanalise_id = tipoanalise_id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() 
	{
		return "TipoAnalise [tipoanalise_id=" + tipoanalise_id + ", tipo=" + tipo + "]";
	}

	
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoAnalise other = (TipoAnalise) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (tipoanalise_id != other.tipoanalise_id)
			return false;
		return true;
	}
}
