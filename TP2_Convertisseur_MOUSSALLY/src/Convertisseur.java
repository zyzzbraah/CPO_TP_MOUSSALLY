/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mouss
 */
public class Convertisseur {
    int nbConversions ;
    
    public Convertisseur () {
        nbConversions = 0 ;
    }
    public double CelsiusVersKelvin (double temp){ //en entrée on donne une temperature temp qui sera converti grace a la ligne suivante
        nbConversions ++ ;
        return temp+273.15;  //en sorti on obtient temp la valeur en entréé convertie a l'unité que l'on souhaite 
    }
    public double KelvinVersCelsius (double temp) { //meme chose pour chaques conversions
        nbConversions ++ ;
        return temp - 273.15 ;
    }
    public double FarenheitVersCelsius (double temp) {
        nbConversions ++ ; 
        return (temp-32)*1.8 ;
    }
    public double CelsiusVersFarenheit (double temp) {
        nbConversions ++ ;
        return (temp*1.8)-32 ;
        
    }
    public double FarenheitVersKelvin (double temp)  {
        nbConversions ++ ;
        return 273.15+((temp-32)*1.8) ;
        
    }
    public double KelvinVersFarenheit (double temp)  {
        return ((temp-273.15)*1.8)-32 ;
        
    }
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }
    
}

