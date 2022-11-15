/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

import Armes.*;
import Personnages.*;
import java.util.ArrayList;



/**
 *
 * @author mouss
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee Excalibur = new Epee("Excalibur",7,5);
        //System.out.println(Excalibur);
        
        Epee Durandal = new Epee("Durandal",4,7);
        //System.out.println(Durandal);
        
        Baton Baton1 = new Baton("Chêne",4,5);
        Baton Baton2 = new Baton("Charme",5 ,6);
        //System.out.println(Baton1);
        
        ArrayList<Armes> Rangement = new ArrayList<>();
        
        Magicien Gandalf = new Magicien ("Gandalf",65 ,true  );
        System.out.println(Gandalf);   
        
        Magicien Garcimore = new Magicien ("Garcimore", 44 ,false);
        System.out.println(Garcimore);   
        
        Guerrier Conan = new Guerrier ("conan", 78, false );
        System.out.println(Conan);
        
        Guerrier Lannister = new Guerrier ("Lannister", 45, true);
        System.out.println(Lannister);
        
        ArrayList<Personnages> Rangement2 = new ArrayList<>();
        
    Rangement.add(Excalibur);
    Rangement.add(Durandal);
    Rangement.add(Baton1);
    Rangement.add(Baton2);
    
    Rangement2.add(Gandalf);
    Rangement2.add(Garcimore);
    Rangement2.add(Conan);
    Rangement2.add(Lannister);
    
    System.out.println(Rangement.get(0));
    System.out.println(Rangement2.get(0));

    
    }
    
}
