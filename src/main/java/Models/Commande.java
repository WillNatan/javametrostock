/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Julien
 */
public class Commande {
    private int id;
    private Date datecommande;
    private int nocommande;

    public int getNocommande() {
        return nocommande;
    }

    public void setNocommande(int nocommande) {
        this.nocommande = nocommande;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public Date getDatecommande() {
        return datecommande;
    }

    public void setDatecommande(Date datecommande) {
        this.datecommande = datecommande;
    }
    
}
