/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur.pkg_.artero;

import java.util.Scanner;

/**
 *
 * @author eloi
 */
public class TP1_convertisseur_ARTERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double val;
       System.out.println("Veuillez choisir une valeur"); 
        Scanner sc;
sc = new Scanner(System.in);  
val = sc.nextDouble();
double tempK;
tempK= 273+val;
System.out.println("Temperature en degré celcius: "+ val + " ℃"+"\nTemperature en Kelvin: "+tempK+" K"); 
    }
public static double CelciusVersKelvin (double tCelcius) {    
        return 0;
} 
}
