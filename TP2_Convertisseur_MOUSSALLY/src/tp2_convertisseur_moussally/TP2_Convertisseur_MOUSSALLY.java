/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_moussally;

import java.util.Scanner;

/**
 *
 * @author mouss
 */
public class TP2_Convertisseur_MOUSSALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur Ctemp1 = new Convertisseur () ; //creation nouvel object de type convertisseur 
        Ctemp1.CelsiusVersFarenheit(10); //on joue avec 
        Ctemp1.FarenheitVersKelvin(16);
        Ctemp1.KelvinVersFarenheit(21);
        Ctemp1.FarenheitVersCelsius(31);
        Convertisseur Ctemp2 = new Convertisseur ()  ; //creation deuxieme nouvel object
        Ctemp2.CelsiusVersFarenheit(30) ;
        
        // création du menu
        Scanner sc = new Scanner(System.in);
        Convertisseur troisiemesConversions = new Convertisseur();
	System.out.println("Bonjour, saisissez une valeur : ");
	double valeur = sc.nextDouble();
	              
	System.out.println("Saisissez la conversion que vous souhaiter effectuer :"); 
	System.out.println("1) Celcius Vers Kelvin");
	System.out.println("2) Kelvin Vers Celcius");
	System.out.println("3) Farenheit Vers Celcius");
	System.out.println("4) Celcius Vers Farenheit");
	System.out.println("5) Kelvin Vers Farenheit");
	System.out.println("6) Farenheit Vers Kelvin");
	        
	int convUtilisateur = sc.nextInt();
	double answer;
	        
	if (convUtilisateur == 1) {
	    answer = troisiemesConversions.CelsiusVersKelvin(valeur);
	    System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Kelvin");
	}
	       
	if (convUtilisateur == 2) {
	    answer = troisiemesConversions.KelvinVersCelsius(valeur);
	    System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Celcius");
	}
	        
	if (convUtilisateur == 3) {
	    answer = troisiemesConversions.FarenheitVersCelsius(valeur);
	    System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Celcius");
	}
	        
	if (convUtilisateur == 4) {
	    answer = troisiemesConversions.CelsiusVersFarenheit(valeur);
	    System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Farenheit");
	}
	        
	if (convUtilisateur == 5) {
	    answer = troisiemesConversions.KelvinVersFarenheit(valeur);
	    System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Farenheit");
	}
	     
	if (convUtilisateur == 6) {
	    answer = troisiemesConversions.FarenheitVersKelvin(valeur);
	    System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Kelvin");
	}
    }  
	

    
    
}
