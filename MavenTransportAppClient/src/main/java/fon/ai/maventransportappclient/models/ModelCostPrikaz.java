/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.maventransportappclient.models;

import fon.ai.maventransportappcommon.domain.Cost;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stackOverflow
 */
public class ModelCostPrikaz extends AbstractTableModel{
    String[] kolone = {"Tip troska", "Iznos"};
    ArrayList<Cost> costs;

    public ModelCostPrikaz() {
        costs = new ArrayList<>();
    }

    public ModelCostPrikaz(ArrayList<Cost> costs) {
        this.costs = costs;
    }
    
    
    @Override
    public int getRowCount() {
        return costs.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Cost c = costs.get(i);
        
        switch(i1){
            case 0: return c.getCostType().toString();
            case 1: return c.getAmount();
            default: return "n/a";
         }
    }

    @Override
    public String getColumnName(int i) {
        return kolone[i];
    }

    public int getVelicinaListe() {
        return costs.size();
    }
    
    
    
}
