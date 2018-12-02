package com.trabalhobd.classes;

import java.util.ArrayList;

public class Clinica {
	private ArrayList<Utilizador> utilizadores;
	private ArrayList<Medico> medicos;
	private ArrayList<TipoAnalise> tipoAnalise;
	private ArrayList<TipoConsulta> tipoConsulta;
	private ArrayList<TipoExame> tipoExame;
	private ArrayList<TipoVacina> tipoVacina;

    public void dumpData(){
        this.addUtilizador(new Utilizador(0,"Nelson","morada","telefone","username","password","email"));
        this.addUtilizador(new Utilizador(1,"Nelson","morada","telefone","username","password","email"));
    }

	public Clinica() {
		utilizadores = new ArrayList<Utilizador>();
		medicos = new ArrayList<Medico>();
		tipoAnalise = new ArrayList<TipoAnalise>();
		tipoConsulta = new ArrayList<TipoConsulta>();
		tipoExame = new ArrayList<TipoExame>();
		tipoVacina = new ArrayList<TipoVacina>();
	}

	// Gets
	public ArrayList<Utilizador> getUtilizadores() {
		ArrayList<Utilizador> aux = new ArrayList<Utilizador>();

		for (Utilizador u : utilizadores)
			aux.add(u);

		return aux;
	}

	public ArrayList<Medico> getMedicos() {
		ArrayList<Medico> aux = new ArrayList<Medico>();

		for (Medico m : medicos)
			aux.add(m);

		return aux;
	}
	
	public ArrayList<TipoAnalise> getTipoAnalise() {
		ArrayList<TipoAnalise> aux = new ArrayList<TipoAnalise>();

		for (TipoAnalise a : tipoAnalise)
			aux.add(a);

		return aux;
	}

    public ArrayList<TipoConsulta> getTipoConsulta() {
        ArrayList<TipoConsulta> aux = new ArrayList<TipoConsulta>();

        for (TipoConsulta a : tipoConsulta)
            aux.add(a);

        return aux;
    }

    public ArrayList<TipoExame> getTipoExame() {
        ArrayList<TipoExame> aux = new ArrayList<TipoExame>();

        for (TipoExame a : tipoExame)
            aux.add(a);

        return aux;
    }

    public ArrayList<TipoVacina> getTipoVacina() {
        ArrayList<TipoVacina> aux = new ArrayList<TipoVacina>();

        for (TipoVacina a : tipoVacina)
            aux.add(a);

        return aux;
    }

	// Add
	public void addUtilizador(Utilizador u) {
		this.utilizadores.add(u);
	}

	public void addMedico(Medico m) {
		this.medicos.add(m);
	}

	public void addTipoAnalise(TipoAnalise m) {
		this.tipoAnalise.add(m);
	}

	public void addTipoConsulta(TipoConsulta m) {
		this.tipoConsulta.add(m);
	}

	public void addTipoExame(TipoExame m) {
		this.tipoExame.add(m);
	}
	
	public void addTipoVacina(TipoVacina m) {
		this.tipoVacina.add(m);
	}

	// Existe
	public int existeUtilizador(String nome) {
        int i = 0;
		for(Utilizador u : utilizadores){
            if(u.getNome().equals(nome)){
                return i;
            } else {
                i++;
            }
        }
        return -1;
	}

    public int existeMedico(String nome) {
        int i = 0;
        for(Medico m : medicos){
            if(m.getNome().equals(nome)){
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public int existeTipoAnalises(String nome) {
        int i = 0;
        for(TipoAnalise a : tipoAnalise){
            if(a.getTipo().equals(nome)){
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public int existeTipoConsultas(String nome) {
        int i = 0;
        for(TipoConsulta c : tipoConsulta){
            if(c.getNome().equals(nome)){
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public int existeTipoExame(String nome) {
        int i = 0;
        for(TipoExame e : tipoExame){
            if(e.getNome().equals(nome)){
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public int existeTipoVacina(String nome) {
        int i = 0;
        for(TipoVacina e : tipoVacina){
            if(e.getTipo().equals(nome)){
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

	// Remover
	public void removeUtilizador(String nome) {
        int id = existeUtilizador(nome);

		if (id != -1)
			utilizadores.remove(id);
	}

    public void removeMedico(String nome) {
        int id = existeMedico(nome);

        if (id != -1)
            medicos.remove(id);
    }

    public void removeTipoAnalise(String nome) {
        int id = existeTipoAnalises(nome);

        if (id != -1)
            tipoAnalise.remove(id);
    }

    public void removeTipoConsulta(String nome) {
        int id = existeTipoConsultas(nome);

        if (id != -1)
            tipoConsulta.remove(id);
    }

    public void removeTipoExame(String nome) {
        int id = existeTipoExame(nome);

        if (id != -1)
            tipoExame.remove(id);
    }

    public void removeTipoVacina(String nome) {
        int id = existeTipoVacina(nome);

        if (id != -1)
            tipoVacina.remove(id);
    }
}