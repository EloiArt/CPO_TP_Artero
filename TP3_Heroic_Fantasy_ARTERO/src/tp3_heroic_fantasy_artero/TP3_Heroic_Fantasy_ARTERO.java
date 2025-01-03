/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_artero;

import arme.epee;
import arme.baton;
import Personnages.Magicien;
import Personnages.Guerrier;

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
           // Création des armes
        epee excalibur = new epee("Excalibur", 7, 5);
        epee durandal = new epee("Durandal", 4, 7);
        baton chene = new baton("Chêne", 4, 5);
        baton charme = new baton("Charme", 5, 6);

        // Création des personnages
        Guerrier conan = new Guerrier("Conan", 78, true);
        Magicien gandalf = new Magicien("Gandalf", 65, false);

        // Ajout d'armes
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);

        // Equipement
        conan.equiperArme("Excalibur");
        gandalf.equiperArme("Chêne");

        // Combat
        System.out.println("\nDébut du combat !");
        conan.attaquer(gandalf);
        gandalf.attaquer(conan);

        // Affichage des résultats
        System.out.println("\nÉtat des personnages :");
        System.out.println(conan);
        System.out.println(gandalf);
    }
}

   
    
    

