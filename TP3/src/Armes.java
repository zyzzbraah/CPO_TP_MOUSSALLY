/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mouss
 */
public class Armes {
    String nom;
    int NivAtt;
   
    public Armes(String unNom, int unNivAtt) {
        nom = unNom;
        NivAtt = unNivAtt;
        if (NivAtt< 0) {
            NivAtt = 0;
        }
        if (NivAtt > 100) {
            NivAtt = 100;
        }
    }  
        @Override
        public String toString() {
            String rep;
            rep = "Arme " + nom + " de niveau " + NivAtt;
            return rep;
            
        }
}
