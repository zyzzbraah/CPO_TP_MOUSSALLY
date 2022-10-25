/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mouss
 */
public class Convertisseur {
    
    
    public Convertisseur () {
        nbConversions = 0 ;
    }
    public double CelsiusVersKelvin (double temp){ //en entrée on donne une temperature temp qui sera converti grace a la ligne suivante
        temp += 273.15 ;
        return temp;  //en sorti on obtient temp la valeur en entréé convertie a l'unité que l'on souhaite 
    }
    public double KelvinVersCelsius (double temp) { //meme chose pour chaques conversions
        temp -=273.15 ;
        return temp;
    }
    public double FarenheitVersCelsius (double temp) {
        temp = (temp-32)*1.8 ; 
        return temp ;
    }
    public double CelsiusVersFarenheit (double temp) {
        temp = (temp*1.8)-32 ;
        return temp ;
    }
    public double FarenheitVersKelvin (double temp)  {
        temp = ((temp-32)*1.8)+273,15  ;
    }
}

