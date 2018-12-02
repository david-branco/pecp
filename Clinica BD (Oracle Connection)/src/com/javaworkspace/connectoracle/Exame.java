package com.javaworkspace.connectoracle;
import java.io.Serializable;

public class Exame implements Serializable
{
   private int exame_id;
   private String local;
   private String tipo;
   
   public Exame(int cExameID, String cLocal, String cTipo)
   {
       exame_id       = cExameID;
       local          = cLocal;
       tipo           = cTipo;
   }
    
   public Exame(Exame e)
   {
       exame_id       = e.getExameID();
       local          = e.getLocal();
       tipo           = e.getTipo();
   }
    
   // Get's
   public int getExameID()              { return this.exame_id;  }
   public String getLocal()             { return this.local;     }
   public String getTipo()              { return this.tipo;      }
      
   
   // Set's
   public void setExameID(int cExameID)                { exame_id = cExameID;   }
   public void setLocal(String cLocal)                 { local = cLocal;        }
   public void setTipo(String cTipo)                   { tipo = cTipo;          }
   
   // Clone
   public Exame clone() { return new Exame(this); }
   
   // Equals
   public boolean equals(Object o) 
   {
        if (this == o) 
            return true;
            
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
            
        Exame umExame = (Exame)o;
        
        return (
                       this.exame_id == umExame.getExameID() 
                    && this.local.equals(umExame.getLocal()) 
                    && this.tipo.equals(umExame.getTipo())
               );
   }

    // To String
	public String toString() 
	{
		return "Exame [exame_id=" + exame_id + ", local=" + local + ", tipo=" + tipo + "]";
	}
}
