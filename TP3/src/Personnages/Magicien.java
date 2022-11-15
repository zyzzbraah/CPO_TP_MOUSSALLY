/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author mouss
 */
public class Magicien extends Personnages { 
    boolean conf;

    public Magicien(String n , int i , boolean a) {
        super(n,i);
        conf=a;
    }
    
    @Override
    public String toString() {
        if (conf == true) {
        return "Magicien"+nom+ "("+hp + "points de vie), niveau confirme";
        }
        else {
            return "Magicien"+nom+ "("+hp + "points de vie), niveau novice";

        }
    }
            }
