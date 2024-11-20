/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_artero;

/**
 *
 * @author eloi
 */
public class TP3_Heroic_Fantasy_ARTERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arme epee = new Arme("Épée légendaire", 10);
        System.out.println("Nom de l'arme : " + epee.getNom());  // Affiche : Épée légendaire
        System.out.println("Niveau d'attaque : " + epee.getAttaque());  // Affiche : 90
   
    }
    
}
