package com.javaworkspace.connectoracle;
import java.util.*;
import java.io.*;

public class Vacina implements Serializable
{
   private int vacina_id;
   private double dose;
   private int periodicidade;
   private TipoVacina tipo;
   
   public Vacina(int vacina_id, double dose, int periodicidade, TipoVacina tipo) 
   {
	   this.vacina_id = vacina_id;
	   this.dose = dose;
	   this.tipo = tipo;
	   this.periodicidade = periodicidade;
	   this.tipo = tipo;
   }

    
   public Vacina(Vacina v)
   {
       vacina_id      = v.getVacinaID();
       dose           = v.getDose();
       tipo           = v.getTipo();
       periodicidade  = v.getPeriodicidade();
       tipo			  = v.getTipo();
   }
   
   public Vacina() {}
    
   // Get's
   public int getVacinaID()             { return this.vacina_id; 		}
   public double getDose()              { return this.dose;      		}
   public int getPeriodicidade()		{ return this.periodicidade; 	}
   public TipoVacina getTipo()			{ return this.tipo;				}
      
   
   // Set's
   public void setVacinaID(int cVacinaID)              	{ vacina_id = cVacinaID;   			}
   public void setDose(double cDose)                   	{ dose = cDose;            			}
   public void setTipo(TipoVacina cTipo)                { tipo = cTipo;            		 	}
   public void setPeriodicdade(int cPeriodicidade)		{ periodicidade = cPeriodicidade; 	}
   
   // Clone
   public Vacina clone() { return new Vacina(this); }
   
   // To String
   public String toString() 
   {
		return "Vacina [vacina_id=" + vacina_id + ", dose=" + dose + ", tipo="
				+ tipo + ", periodicidade=" + periodicidade + "]";
   }
    
   // Equals
   public boolean equals(Object o) 
   {
        if (this == o) 
            return true;
            
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
            
        Vacina umVacina = (Vacina)o;
        
        return (
                       this.vacina_id == umVacina.getVacinaID() 
                    && this.dose == umVacina.getDose() 
                    && this.tipo.equals(umVacina.getTipo())
               );
   }
}