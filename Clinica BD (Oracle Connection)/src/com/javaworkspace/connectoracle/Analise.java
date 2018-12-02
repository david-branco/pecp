package com.javaworkspace.connectoracle;
import java.io.Serializable;

public class Analise implements Serializable
{
   private int analise_id;
   private double preco;
   private String local;
   private TipoAnalise tipo;

   public Analise(int analise_id, int preco, int medico_id, String local, TipoAnalise tipo)
   {
       this.analise_id  = analise_id;
       this.preco		= preco;
       this.local		= local;
       this.tipo		= tipo;
   }
    
   public Analise(Analise a)
   {
       this.analise_id     	= a.getAnaliseID();
       this.preco		  	= a.getPreco();
       this.local			= a.getLocal();
       this.tipo			= a.getTipo();
   }
    
   // Get's
   public int getAnaliseID()            { return this.analise_id;   }
   public double getPreco()				{ return this.preco;		}
   public String getLocal()				{ return this.local;		}
   public TipoAnalise getTipo()			{ return this.tipo;			}
      
   // Set's
   public void setAnaliseID(int cAnaliseID)         { this.analise_id = cAnaliseID;   	}
   public void setPreco(double preco) 				{ this.preco = preco; 				}
   public void setLocal(String local)				{ this.local = local;				}
   public void setTipo(TipoAnalise tipo)			{ this.tipo = tipo;					}

   // Clone
   public Analise clone() { return new Analise(this); }
   
   // To String
 
   public String toString() 
   {
	   return "Analise [analise_id=" + analise_id + ", preco=" + preco + ", local=" + local + ", tipo=" + tipo + "]";
   }
 
   // Equals
   public boolean equals(Object o) 
   {
        if (this == o) 
            return true;
            
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
            
        Analise umAnalise = (Analise)o;
        
        return ( this.analise_id == umAnalise.getAnaliseID() );
   }


}
