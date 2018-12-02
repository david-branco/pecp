package com.trabalhobd.models;

import com.trabalhobd.classes.TipoVacina;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class VacinaModel extends AbstractTableModel{
    private ArrayList<TipoVacina> vacinas;
    private String[] columns = {"ID","Tipo"};

    public VacinaModel(ArrayList<TipoVacina> vacinas){
        this.vacinas = vacinas;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return vacinas.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch(j){
            case 0: return vacinas.get(i).getTipovacina_id();
            case 1: return vacinas.get(i).getTipo();
        }
        return "Error";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}
