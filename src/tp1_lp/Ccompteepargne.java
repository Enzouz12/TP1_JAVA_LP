/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_lp;

import java.text.DecimalFormat;

/**
 *
 * @author Enzou
 */
public class Ccompteepargne extends Ccompte {
    private double tauxDeRemuneration=0;
    
    Ccompteepargne() {
        super();
    }
    
    Ccompteepargne(double avoir, double tauxDeRemuneration) {
        super(avoir);
        this.tauxDeRemuneration=tauxDeRemuneration;
    }
    
    Ccompteepargne(double tauxDeRemuneration) {
        super();
        this.tauxDeRemuneration=tauxDeRemuneration;
    }
    
    @Override
    public void affiche() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        String chaine=super.toString();
        chaine+="Taux de rémunération à "+tauxDeRemuneration+"%\n";
        return chaine;
    }
    
    public double calcul_interets() {
        DecimalFormat decimalFormat =  new DecimalFormat("#.##");
        double res=avoir*tauxDeRemuneration;
        System.out.println("Vos intérêts s'élèveront à "+decimalFormat.format(res)+"€ en fin d'année\n");
        return res;
    }
    
    public void setTauxDeRemuneration(double tauxDeRemuneration) {
        this.tauxDeRemuneration=tauxDeRemuneration;
    }
    
    public double getTauxDeRemuneration() {
        return this.tauxDeRemuneration;
    }
    
}
