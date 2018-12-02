package com.javaworkspace.connectoracle;

public class Main 
{
    public static void main(String args[])
    {
        Clinica clinica = new Clinica();
        
        Utilizador u = new Utilizador();
        
        Episodio e = new Episodio();
        
        Vacina v = new Vacina();
        
        Medico m = new Medico();
        
        Administrador a = new Administrador("Carlos","lala");
        
        clinica.setAdministrador(a);
        
        clinica.login("lala");
        
        u.addEpisodio(e);
        
        u.getEpisodios();
        
        u.getEpisodios(v);

        clinica.addUtilizador(u);
        
        clinica.addMedico(m);

        clinica.loginUtilizador(u.getUtilizadorID(), "password");

        clinica.changePassword(u.getUtilizadorID(), "newPassword");
     
        clinica.getUtilizadores();
     
        clinica.removeUtilizador(u.getUtilizadorID());
        
        clinica.removeMedico(m.getMedicoID());
        
        Utilizador u1 = clinica.getUtilizador(123);
        
    }

}
