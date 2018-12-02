package com.trabalhobd.models;

import com.trabalhobd.classes.TipoAnalise;
import com.trabalhobd.classes.Utilizador;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class AnalisesModel extends AbstractTableModel{
    private ArrayList<TipoAnalise> analises;
    private String[] columns = {"ID","Tipo"};

    public AnalisesModel(ArrayList<TipoAnalise> analises){
        this.analises = analises;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return analises.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch(j){
            case 0: return analises.get(i).getTipoanalise_id();
            case 1: return analises.get(i).getTipo();
        }
        return "Error";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}
