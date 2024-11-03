/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_.artero;

/**
 *
 * @author eloi
 */
public class TP2_convertisseurObjet_Artero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     
     
       Convertisseur convertisseur1 = new Convertisseur();
       
       convertisseur1.CelciusVersKelvin(1);
       convertisseur1.KelvinVersCelcius(1);
       convertisseur1.FarenheitVersCelcius(1);
       convertisseur1.CelciusVersFarenheit(1);
       convertisseur1.KelvinVersFarenheit(1);
       convertisseur1.FarenheitVersKelvin(1);
       System.out.println(convertisseur1);
       
       
       
       
       
       
    }
   
}
