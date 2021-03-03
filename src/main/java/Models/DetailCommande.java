/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Julien
 */
public class DetailCommande {
    private int id;
    private int qteproduitcmd;
    private int prixtotal;
    private String etat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQteproduitcmd() {
        return qteproduitcmd;
    }

    public void setQteproduitcmd(int qteproduitcmd) {
        this.qteproduitcmd = qteproduitcmd;
    }

    public int getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(int prixtotal) {
        this.prixtotal = prixtotal;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
}
