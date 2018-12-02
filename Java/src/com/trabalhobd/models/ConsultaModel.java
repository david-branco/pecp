package com.trabalhobd.models;

import com.trabalhobd.classes.TipoAnalise;
import com.trabalhobd.classes.TipoConsulta;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ConsultaModel extends AbstractTableModel{
    private ArrayList<TipoConsulta> consultas;
    private String[] columns = {"ID","Tipo"};

    public ConsultaModel(ArrayList<TipoConsulta> consultas){
        this.consultas = consultas;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return consultas.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        switch(j){
            case 0: return consultas.get(i).getTipoconsulta_id();
            case 1: return consultas.get(i).getNome();
        }
        return "Error";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
    }
}
