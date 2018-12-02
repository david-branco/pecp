package com.javaworkspace.connectoracle;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeMap;

public class Utilizador implements Serializable
{
   private int utilizador_id;
   private String nome;
   private String telefone;
   private String username;
   private String email;
   private String password;
   private TreeMap<Integer, Episodio> episodios;
      
   public Utilizador()
   {
       episodios = new TreeMap<Integer, Episodio>();
   }
   
   public Utilizador(int cUtilizadorID, String cNome, String cTelefone, String cUsername, String cEmail, String cPassword, TreeMap<Integer, Episodio> cEpisodios)
   {
       utilizador_id    = cUtilizadorID;
       nome             = cNome;
       telefone         = cTelefone;
       username         = cUsername;
       email            = cEmail;
       password         = cPassword;
       
       episodios = new TreeMap<Integer, Episodio>();
        
        for(Episodio e : cEpisodios.values())
        {
            episodios.put(e.getEpisodioID(), e);
        }
   }
    
   public Utilizador(Utilizador u)
   {
       utilizador_id    = u.getUtilizadorID();
       nome             = u.getNome();
       telefone         = u.getTelefone();
       username         = u.getUsername();
       email            = u.getEmail();
       password         = u.getPassword();
       
       TreeMap<Integer,Episodio> auxEpisodios = u.getEpisodios();
        
       for(Integer i : episodios.keySet())
            auxEpisodios.put(i, episodios.get(i)); 
   }
    
   // Get's
   public int getUtilizadorID()     { return this.utilizador_id;    }
   public String getNome()          { return this.nome;             }
   public String getTelefone()      { return this.telefone;         }
   public String getUsername()      { return this.username;         }
   public String getEmail()         { return this.email;            }
   public String getPassword()      { return this.password;         }
   

   // Set's
   public void setUtilizadorID(int cUtilizadorID)       { utilizador_id = cUtilizadorID;    }
   public void setNome(String cNome)                    { nome = cNome;                     }
   public void setTelefone(String cTelefone)            { telefone = cTelefone;             }
   public void setUsername(String cUsername)            { username = cUsername;             }
   public void setEmail(String cEmail)                  { email = cEmail;                   }
   public void setPassword(String cPassword)            { password = cPassword;             }
   
  
   // Clone
   public Utilizador clone() { return new Utilizador(this); }
   
   public TreeMap<Integer, Episodio> getEpisodios()
   {
        TreeMap<Integer, Episodio> aux = new TreeMap<Integer, Episodio>();
        
        Set<Integer> keys = episodios.keySet();
        
        for(Integer i : keys)
            aux.put(i, episodios.get(i));
        
        return aux;
    }
   
   public TreeMap<Integer, Episodio> getEpisodios(Object o)
   {
	   TreeMap<Integer, Episodio> aux = new TreeMap<Integer, Episodio>();
	   
	   Set<Integer> keys = episodios.keySet();
	   
	   for(Integer i : keys)
	   {
		   if(episodios.get(i).getTipoEpisodio().equals(o))
		   {
			   aux.put(i, episodios.get(i));
		   }
	   }
	   return aux;
   }

   public void addEpisodio(Episodio e)
   {
   		this.episodios.put(e.getEpisodioID() , e);
   }
   
   // To String
   public String toString() 
   {
       StringBuilder s = new StringBuilder("------ Utilizador ---------  \n");
       s.append("ID: "                + utilizador_id +                 "\n");
       s.append("Nome: "              + nome +                          "\n");
       s.append("Telefone: "                + telefone +                "\n");
       s.append("Username: "              + username +                  "\n");
       s.append("Email: "              + email +                        "\n");
       s.append("Password: "              + password +                  "\n");

       return s.toString();
   } 
    
   // Equals
   public boolean equals(Object o) 
   {
        if (this == o) 
            return true;
            
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
            
        Utilizador umUtilizador = (Utilizador)o;
        
        return (
                       this.utilizador_id == umUtilizador.getUtilizadorID() 
                    && this.nome.equals(umUtilizador.getNome()) 
                    && this.username.equals(umUtilizador.getUsername())
               );
   }
}