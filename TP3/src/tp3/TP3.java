/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

import Armes.Epee;
import Armes.Baton;
import Armes.Armes;
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
        
        ArrayList<Armes> Rangement = new ArrayList<Armes>();
    Rangement.add(Excalibur);
    Rangement.add(Durandal);
    Rangement.add(Baton1);
    Rangement.add(Baton2);
    
    System.out.println(Rangement.get(0));


    }
    
}
