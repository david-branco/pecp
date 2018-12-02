package com.javaworkspace.connectoracle;
public class TipoConsulta 
{
	private int tipoconsulta_id;
	private String nome;
	
	public TipoConsulta(int tipoconsulta_id, String nome) 
	{
		this.tipoconsulta_id = tipoconsulta_id;
		this.nome = nome;
	}

	public int getTipoconsulta_id() 	{ return tipoconsulta_id;	}
	public String getNome() 			{ return nome; 				}
	
	public void setTipoconsulta_id(int tipoconsulta_id) 	{ this.tipoconsulta_id = tipoconsulta_id; 	}
	public void setNome(String nome) 						{ this.nome = nome; 						}

	public String toString() {
		return "TipoConsulta [tipoconsulta_id=" + tipoconsulta_id + ", nome="
				+ nome + "]";
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


