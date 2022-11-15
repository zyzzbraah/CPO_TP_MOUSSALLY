/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author mouss
 */
public class Personnages {
    String nom;
    int hp;
    
    public int getHp() {
        return hp;
        
    }
    
    public void setHp(int hp) {
        this.hp=hp;
    }
     
    public Personnages (String unNom, int nbHp) {
        nom = unNom;
        hp = nbHp;
        
        if (hp<0) hp = 0;
        
    }
    
    @Override
    public String toString() {
        String rep;
        rep = nom + hp +"pv";
        return rep;
    }
}
