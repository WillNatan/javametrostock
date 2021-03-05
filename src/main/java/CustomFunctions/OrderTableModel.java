/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomFunctions;

import Models.Commande;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willy
 */
public class OrderTableModel extends AbstractTableModel {

    private List<Commande> orders;

    public void setOrders(List<Commande> orders) {
        this.orders = orders;
    }

    
    private String colNames[];

    public OrderTableModel(List<Commande> products, String colnames[]) {
        this.orders = new ArrayList<>(products);
        this.colNames = colnames;
    }
    
    public void ajouter(Commande product){
        orders.add(product);
        this.fireTableDataChanged();
    }
    
    

    @Override
    public int getRowCount() {
        return orders.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public String getColumnName(int index) {
        return colNames[index];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Commande order = orders.get(rowIndex);
        Object value = null;
        
        switch (columnIndex) {
            case 0:
                value = order.getId();
                break;
            case 1:
                value = order.getNocommande();
                break;
            
        }

        return value;
    }

}
