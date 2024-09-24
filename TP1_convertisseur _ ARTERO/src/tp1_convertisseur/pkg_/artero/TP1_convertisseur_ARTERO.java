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
un = CelciusVersKelvin (val);
    deux = KelvinVersCelcius(val) ;
    trois = FarenheitVersCelcius(val);
    quatre = CelciusVersFarenheit(val);
    cinq = KelvinVersFarenheit(val);
    six = FarenheitVersKelvin(val);
System.out.println("Saisissez la conversion que vous souhaiter effectuer :"+"\n1) De Celcius vers Kelvin" + "\n2) De Kelvin vers Celcius"+"\n3) De Farenheit vers Celcius"+"\n4) De Celcius vers Farenheit"+"\n5) De Kelvin vers Farenheit"+"\n6) De Farenheit vers Kelvin");

  choix = sc.nextInt();
     if (choix == 1){
            
            System.out.println(val+" degré Celcius est égal a "+un+" degrés Kelvin");
            
         }
         if (choix == 2){
            
            System.out.println(val+" degré Kelvin est égal a "+deux+" degrés Celcius");
            
         }
        
         if (choix == 3){
            
            System.out.println(val+" degré Farenheit est egal a "+trois+" degrés Celcius");
            
         }
        
         if (choix == 4){
            
             System.out.println(val+" degré Celcius est egal a "+quatre+" degrés Farenheit");             
         }
        
          if (choix == 5){
            
             System.out.println(val+" degré Kelvin est egal a "+cinq+" degrés Farenheit");            
         }
         
           if (choix == 6){
            
              System.out.println(val+" degré Farenheit est egal a "+six+" degrés Kelvin");            
         }
           if (choix>6){
                System.out.println("Entrez une valeur correcte");
           }
         if (choix<6){
                System.out.println("Entrez une valeur correcte");
           }
  
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
