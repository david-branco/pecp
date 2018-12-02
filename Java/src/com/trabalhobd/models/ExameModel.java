package com.trabalhobd.models;

import com.trabalhobd.classes.TipoExame;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ExameModel extends AbstractTableModel{
    private ArrayList<TipoExame> exames;
    private String[] columns = {"ID","Tipo"};

    public ExameModel(ArrayList<TipoExame> exames){
        this.exames = exames;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return exames.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch(j){
            case 0: return exames.get(i).gettipoexame_id();
            case 1: return exames.get(i).getNome();
        }
        return "Error";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}
