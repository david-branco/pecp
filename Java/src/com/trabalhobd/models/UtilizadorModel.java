package com.trabalhobd.models;

import com.trabalhobd.classes.Utilizador;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class UtilizadorModel extends AbstractTableModel{
    private ArrayList<Utilizador> utilizadores;
    private String[] columns = {"ID","Nome","Morada","Telefone","Email","Username","Password"};

    public UtilizadorModel(ArrayList<Utilizador> utilizadores){
        this.utilizadores = utilizadores;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return utilizadores.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch(j){
            case 0: return utilizadores.get(i).getUtilizadorID();
            case 1: return utilizadores.get(i).getNome();
            case 2: return utilizadores.get(i).getMorada();
            case 3: return utilizadores.get(i).getTelefone();
            case 4: return utilizadores.get(i).getEmail();
            case 5: return utilizadores.get(i).getUsername();
            case 6: return utilizadores.get(i).getPassword();
        }
        return "Error";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}
