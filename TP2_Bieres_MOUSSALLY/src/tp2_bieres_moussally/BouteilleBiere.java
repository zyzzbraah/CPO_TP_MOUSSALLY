/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_moussally;

/**
 *
 * @author mouss
 */
public class BouteilleBiere {
    String nom;
    String brasserie;
    double degreAlcool;
    Boolean ouverture;
           
    
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
}
    
}


