package com.javaworkspace.connectoracle;
import java.io.Serializable;

public class Consulta implements Serializable
{
   private int consulta_id;
   private String local;
   private String motivo;
   private String urgencia;
   private String resumo;
   private double preco;
   private TipoConsulta tipo;
   
   public Consulta(int cConsultaID, String cLocal, String cMotivo, String cUrgencia, String cResumo, double cPreco, TipoConsulta cTipo)
   {
       consulta_id  = cConsultaID;
       local        = cLocal;
       motivo       = cMotivo;
       urgencia     = cUrgencia;
       resumo       = cResumo;
       preco		= cPreco;
       tipo			= cTipo;
   }
    
   public Consulta(Consulta c)
   {
       consulta_id      = c.getConsultaID();
       local            = c.getLocal();
       motivo           = c.getMotivo();
       urgencia         = c.getUrgencia();
       resumo           = c.getResumo();
       preco			= c.getPreco();
       tipo				= c.getTipo();
   }
    
   // Get's
   public int getConsultaID()           { return this.consulta_id;  }
   public String getLocal()             { return this.local;        }
   public String getMotivo()            { return this.motivo;       }
   public String getUrgencia()          { return this.urgencia;     }
   public String getResumo()            { return this.resumo;       }
   public double getPreco()				{ return this.preco;		}
   public TipoConsulta getTipo()		{ return this.tipo;			}
      
   
   // Set's
   public void setConsultaID(int cConsultaID)       { this.consulta_id = cConsultaID;    }
   public void setLocal(String cLocal)              { this.local = cLocal;               }
   public void setMotivo(String cMotivo)            { this.motivo = cMotivo;             }
   public void setUrgencia(String cUrgencia)        { this.urgencia = cUrgencia;         }
   public void setPreco(double preco)				{ this.preco = preco;				 }
   public void setTipo(TipoConsulta tipo)			{ this.tipo = tipo;					 }
   
   // Clone
   public Consulta clone() { return new Consulta(this); }
   
   // To String
   public String toString() 
   {
       StringBuilder s = new StringBuilder("------ Consulta ---------  \n");
       s.append("ID: "                + consulta_id +                 "\n");
       s.append("Local: "              + local +                      "\n");
       s.append("Motivo: "              + motivo +                    "\n");
       s.append("Urg?ncia: "              + urgencia +                "\n");
       s.append("Resumo: "              + resumo +                    "\n");

       return s.toString();
   }

	public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Consulta other = (Consulta) obj;
	if (consulta_id != other.consulta_id)
		return false;
	if (local == null) {
		if (other.local != null)
			return false;
	} else if (!local.equals(other.local))
		return false;
	return true;
	}

   
   
    

}
