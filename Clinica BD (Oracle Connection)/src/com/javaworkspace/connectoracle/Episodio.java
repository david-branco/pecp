package com.javaworkspace.connectoracle;
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Episodio implements Serializable
{
    private int episodio_id;
    private GregorianCalendar data;
    private Consulta consulta;
    private Vacina vacina;
    private Exame exame;
    private Analise analise;
    private Medicamento medicamento;
    private Medico medico;
    
    public Episodio(int episodio_id, GregorianCalendar data, Consulta consulta, Vacina vacina, Exame exame, Analise analise, Medicamento medicamento, Medico medico) 
    {
    	this.episodio_id = episodio_id;
    	this.data = data;
    	this.consulta = consulta;
    	this.vacina = vacina;
    	this.exame = exame;
    	this.analise = analise;
    	this.medicamento = medicamento;
    	this.medico = medico;
    }
    
    public Episodio() 
    {
    	this.vacina = null;
    	this.exame = null;
    	this.analise = null;
    }

	public int getEpisodioID() 				{ return episodio_id;	}
	public GregorianCalendar getData()		{ return data;			}
	public Consulta getConsulta()			{ return consulta; 		}
	public Vacina getVacina() 				{ return vacina;		}
	public Exame getExame() 				{ return exame;			}
	public Medico getMedico() 				{ return medico; 		}
	public Analise getAnalise() 			{ return analise; 		}
	public Medicamento getMedicamento() 	{ return medicamento;   }

	public void setEpisodioID(int episodio_id) 				{ this.episodio_id = episodio_id; 	}
	public void setData(GregorianCalendar data)				{ this.data = data;					}
	public void setConsulta(Consulta consulta) 				{ this.consulta = consulta; 		}
	public void setVacina(Vacina vacina) 					{ this.vacina = vacina;				}
	public void setExame(Exame exame) 						{ this.exame = exame; 				}
	public void setAnalise(Analise analise) 				{ this.analise = analise;			}
	public void setMedico(Medico medico) 					{ this.medico = medico;				}
	public void setMedicamento(Medicamento medicamento) 	{ this.medicamento = medicamento; 	}
	
	public Object getTipoEpisodio()
	{
		Object o = null;
		
		if(consulta!= null)
			o = consulta;
		if(exame != null)	
			o = exame;
		if(analise != null) 
			o = analise;
		if(vacina != null)  
			o = vacina;
		
		return o;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Episodio other = (Episodio) obj;
		if (episodio_id != other.episodio_id)
			return false;
		return true;
	}
}
