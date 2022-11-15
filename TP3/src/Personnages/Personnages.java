/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import java.util.ArrayList;
/**
 *
 * @author mouss
 */
public class Personnages {
    String nom;
    int hp;
    Armes armePortee= null;
    ArrayList <Armes> Armes= new ArrayList <>();
    
    public int getHp() {
        return hp;
        
    }
    
    public void NouvelleArme(Armes weapon){

         if (Armes.size()<=5){

             Armes.add(weapon);

         }

     }
    
    //public void setHp(int hp) {
    //    this.hp=hp;
    //}
     
    public Armes getArmePortee() {

        return armePortee;

    }

 

    public void setArmePortee(Armes armePortee) {

        this.armePortee = armePortee;

    }
    
    public Personnages (String unNom, int nbHp) {
        this.nom =nom;

        if (hp<0){      

            this.hp = 0; //si la vie est <0, on la fixe a 0

        }else {

            this.hp=hp;

        }

    }
        
        
        
    
    
     @Override

    public String toString() {

        if (armePortee!=null){

            return "Personnages{" + "nom=" + nom + ", vie=" + hp + ", Arme portee : "+ armePortee + '}';

        }

        return "Personnages{" + "nom=" + nom + ", vie=" + hp + '}';

    }

   

}
