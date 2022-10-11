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
public class Ccompte {
    protected int numCompte;
    protected double avoir = 0;
    static int nbCompte;
    
    Ccompte(double avoir) {
        nbCompte++;
        numCompte=nbCompte;
        this.avoir=avoir;
    }
    
    Ccompte() {
        nbCompte++;
        numCompte=nbCompte;
    }
    
    @Override
    public String toString() {
        DecimalFormat decimalFormat =  new DecimalFormat("#.##");
        String chaine="Numéro de compte : "+numCompte+"\n";
        chaine+="Total des avoirs : "+decimalFormat.format(avoir)+"€\n";
        return chaine;
    }
    
    public void affiche() {
        System.out.println(toString());
    }
    
    public void crediter(double credit) {
        avoir+=credit;
        System.out.println("Crédit effectué sur le comte "+numCompte+" : +"+credit+"€\n");
    }
    
    public void debiter(double debit) {
        avoir-=debit;
        System.out.println("Débit effectué sur le compte "+numCompte+" : -"+debit+"€\n");
    }
    
    public void setNumCompte(int numCompte) {
        this.numCompte=numCompte;
    }
    
    public void setAvoir(double avoir) {
        this.avoir=avoir;
    }
    
    public int getNumCompte() {
        return this.numCompte;
    }
    
    public double getAvoir() {
        return this.avoir;
    }
    
}
