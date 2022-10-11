/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_lp;

/**
 *
 * @author Enzou
 */
public class TP1_LP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ccompte cpt1 = new Ccompte(434.67);
        Ccompteepargne cpt2 = new Ccompteepargne(600.73,15.15);
        
        cpt1.affiche();
        
        cpt1.crediter(45.45);
        cpt1.affiche();
        
        cpt1.debiter(130.31);
        cpt1.affiche();
        
        cpt2.affiche();
        
        cpt2.crediter(67.26);
        cpt2.affiche();
        
        cpt2.crediter(63.96);
        cpt2.affiche();
        
        cpt2.debiter(183.54);
        cpt2.affiche();
        
        cpt2.crediter(10.99);
        cpt2.affiche();
        
        cpt2.calcul_interets();
    }
    
}
