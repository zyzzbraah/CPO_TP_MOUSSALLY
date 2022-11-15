/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author mouss
 */
public class Guerrier extends Personnages {
    boolean cheval;

    public Guerrier(String n , int i , boolean a) {
        super(n , i );
        cheval = a;
    }
    
    @Override
    public String toString() {
        if (cheval == true) {
        return "Guerrier"+nom+ "("+hp + "points de vie), a cheval";
        }
        else {
            return "Guerrier"+nom+ "("+hp + "points de vie), a pied";

        }
    }
    
    
}
