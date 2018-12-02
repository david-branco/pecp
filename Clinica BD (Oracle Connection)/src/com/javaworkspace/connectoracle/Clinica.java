package com.javaworkspace.connectoracle;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeMap;


public class Clinica implements Serializable
{
    private TreeMap<Integer, Utilizador> utilizadores;
    private TreeMap<Integer, Medico> medicos;
    private Administrador admin;
    
    public Clinica()
    {
        utilizadores = new TreeMap<Integer, Utilizador>();
        medicos = new TreeMap<Integer, Medico>();
    }
    
    public Clinica(TreeMap<Integer, Utilizador> cUtilizadores, TreeMap<Integer, Medico> cMedicos, Administrador administrador)
    {
        utilizadores = new TreeMap<Integer, Utilizador>();
        medicos = new TreeMap<Integer, Medico>();
        
        for(Utilizador u : cUtilizadores.values())
        {
            utilizadores.put(u.getUtilizadorID(), u);
        }
        
        for(Medico m : cMedicos.values())
        {
        	medicos.put(m.getMedicoID(),m);
        }
        	
        
        this.admin = administrador;
    }
    
    public Clinica(Clinica c)
    {
        TreeMap<Integer,Utilizador> auxUtilizadores = c.getUtilizadores();
        TreeMap<Integer,Medico> auxMedicos = c.getMedicos();
        
        for(Integer i : utilizadores.keySet())
            auxUtilizadores.put(i, utilizadores.get(i));
        
        for(Integer i : medicos.keySet())
            auxMedicos.put(i, medicos.get(i));
    }
    
    public void setAdministrador(Administrador admin)
    {
    	this.admin = admin;
    }
    
    
    // Get's
    public TreeMap<Integer, Utilizador> getUtilizadores()
    {
        TreeMap<Integer, Utilizador> aux = new TreeMap<Integer, Utilizador>();
        
        Set<Integer> keys = utilizadores.keySet();
        
        for(Integer i : keys)
            aux.put(i, utilizadores.get(i) );
        
        return aux;
    }
    
    public TreeMap<Integer, Medico> getMedicos()
    {
        TreeMap<Integer, Medico> aux = new TreeMap<Integer, Medico>();
        
        Set<Integer> keys = medicos.keySet();
        
        for(Integer i : keys)
            aux.put(i, medicos.get(i) );
        
        return aux;
    }
    
    // Adicionar utilizador / m仕ico
    
    public void addUtilizador(Utilizador u)
    {
    	this.utilizadores.put(u.getUtilizadorID(), u);
    }
    
    public void addMedico(Medico m)
    {
    	this.medicos.put(m.getMedicoID(),m);
    }
    
    // Verificar exist?ncia de dado utilizador / m仕ico
    
    public boolean existeUtilizador(Integer utilizador_id) 
    {
    	return utilizadores.containsKey(utilizador_id);
    }
    
    public boolean existeMedico(Integer medico_id)
    {
    	return medicos.containsKey(medico_id);
    }
    
    // Remover utilizador / m仕ico
    
    public void removeUtilizador(Integer utilizador_id)
    {
        if (this.existeUtilizador(utilizador_id)) 
            utilizadores.remove(utilizador_id);
    }
    
    public void removeMedico(Integer medico_id)
    {
    	if (this.existeMedico(medico_id))
    		medicos.remove(medico_id);
    }
    
    // Get utilizador / m仕ico
    
    public Utilizador getUtilizador(Integer utilizador_id)
    {
       Utilizador u = null;
       
       if(existeUtilizador(utilizador_id))
            u = utilizadores.get(utilizador_id);
       
       return u;
    }
    
    public Medico getMedico(Integer medico_id)
    {
    	Medico m = null;
    	
    	if(existeMedico(medico_id))
    		m = medicos.get(medico_id);
    	
    	return m;
    }
    
    public boolean loginUtilizador(Integer utilizador_id, String password)
    {
    	Utilizador u;
    	boolean b = false;
    	
    	if(existeUtilizador(utilizador_id))
    	{
    		u = this.utilizadores.get(utilizador_id);
    		if(password.equals(u.getPassword()))
    			b = true;
    	}
    	
    	return b;
    }
    
    // Mudar password Utilizador
    
    public void changePassword(Integer utilizador_id, String newPassword)
    {
    	Utilizador u = this.utilizadores.get(utilizador_id);
    	u.setPassword(newPassword);
    }
    
    // Login Administrador
    
	public boolean login(String password)
	{
		boolean b = false;
		
		if(password.equals(this.admin.getPassword()))
			b = true;
		
		return b;
	}
    		
    
}