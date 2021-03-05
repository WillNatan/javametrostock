/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomFunctions;

import Models.Product;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willy
 */
public class ProductsTableModel extends AbstractTableModel {

    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    private String colNames[];

    public ProductsTableModel(List<Product> products, String colnames[]) {
        this.products = new ArrayList<>(products);
        this.colNames = colnames;
        
        
    }
    
    public void ajouter(Product product){
        products.add(product);
        this.fireTableDataChanged();
    }
    
    

    @Override
    public int getRowCount() {
        return products.size();
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
        Product product = products.get(rowIndex);
        Object value = null;
        
        switch (columnIndex) {
            case 0:
                value = product.getId();
                break;
            case 1:
                value = product.getName();
                break;
            case 2:
                value = product.getPrix()+" €";
                break;
            case 3:
                value = product.getQuantity();
                break;
        }

        return value;
    }

}
