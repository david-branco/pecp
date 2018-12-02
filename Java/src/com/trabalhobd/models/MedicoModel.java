package com.trabalhobd.models;

import com.trabalhobd.classes.Medico;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class MedicoModel extends AbstractTableModel{
    private ArrayList<Medico> medicos;
    private String[] columns = {"ID","Nome","Morada","Especialidade"};

    public MedicoModel(ArrayList<Medico> medicos){
        this.medicos = medicos;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return medicos.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch(j){
            case 0: return medicos.get(i).getMedicoID();
            case 1: return medicos.get(i).getNome();
            case 2: return medicos.get(i).getMorada();
            case 3: return medicos.get(i).getEspecialidade();
        }
        return "Error";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}
