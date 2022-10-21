/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_moussally;

/**
 *
 * @author mouss
 */
public class TP2_Bieres_MOUSSALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des Trolls", 7.0, "Dubuisson");
        
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere biere2 = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        
        biere2.ouverte=false;
        biere2.lireEtiquette();
        
        BouteilleBiere biere3 = new BouteilleBiere ("OURS" , 12.0 , "CHEZ LE JOUSS");
        biere3.lireEtiquette();
        BouteilleBiere biere4 = new BouteilleBiere ("TORNADO", 11.5,"PANAM");
        BouteilleBiere biere5 = new BouteilleBiere ("FEUX FOLLET", 12.5,"BASTAMAN");

        System.out.println(uneBiere.Decapsuler());
        System.out.println(uneBiere);
        System.out.println(biere4.Decapsuler());
        System.out.println(biere4);
        System.out.println(biere3);
        }
    
    }

        
        
        
        
        
        
        
        
                
                
        // TODO code application logic here
    
    

