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
    double choix;
    double un;
    double deux;
    double trois;
    double quatre;
    double cinq;
    double six;
       System.out.println("Bonjour, saisissez une valeur"); 
        Scanner sc;
sc = new Scanner(System.in);  
val = sc.nextDouble();
System.out.println(val);
 
    }
public static double CelciusVersKelvin (double tCelcius) {
         tCelcius = tCelcius+273;
         return tCelcius;
        }
        
         public static double KelvinVersCelcius (double tKelvin ) {
         tKelvin = tKelvin-273;
         return tKelvin;
        }
        
         public static double FarenheitVersCelcius (double Farenheit ) {
         Farenheit = (Farenheit-32)*0.55;
         return Farenheit;
        }
        
         public static double CelciusVersFarenheit (double Celcius ) {
         Celcius = (Celcius*0.55) + 32;
         return Celcius;
        }
        
         public static double KelvinVersFarenheit (double Kelvin ) {
         double celsius = KelvinVersCelcius(Kelvin);
         double tfarenheit = CelciusVersFarenheit(celsius);
         return tfarenheit;
        }
        
         public static double FarenheitVersKelvin (double  farenheit) {
         double celsius = FarenheitVersCelcius(farenheit);
         double Kelvin = CelciusVersFarenheit(celsius);
         return Kelvin;
        }
   
}
