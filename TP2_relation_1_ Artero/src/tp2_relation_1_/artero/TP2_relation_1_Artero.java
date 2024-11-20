/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_.artero;

/**
 *
 * @author eloi
 */
public class TP2_relation_1_Artero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Création des voitures
    voiture uneClio = new voiture("Clio", "Renault", 5);
    voiture uneAutreClio = new voiture("Clio", "Renault", 5);
    voiture une2008 = new voiture("2008", "Peugeot", 6);
    voiture uneMicra = new voiture("Micra", "Nissan", 4);

    // Création des personnes
    personne bob = new personne("Bobby", "Sixkiller");
    personne reno = new personne("Reno", "Raines");

    // Affichage des voitures disponibles
    System.out.println("Liste des voitures disponibles :\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

    // Ajout de la relation : Bob est propriétaire de la Clio
    if (bob.ajouter_voiture(uneClio)) {
        System.out.println("Bob a ajouté la Clio.");
    } else {
        System.out.println("Échec de l'ajout de la Clio à Bob.");
    }

    // Ajout de la deuxième voiture à Bob
    if (bob.ajouter_voiture(uneAutreClio)) {
        System.out.println("Bob a ajouté une autre Clio.");
    } else {
        System.out.println("Échec de l'ajout de la seconde Clio à Bob.");
    }

    // Ajout de deux voitures à Reno
    if (reno.ajouter_voiture(une2008)) {
        System.out.println("Reno a ajouté la 2008.");
    } else {
        System.out.println("Échec de l'ajout de la 2008 à Reno.");
    }

    if (reno.ajouter_voiture(uneMicra)) {
        System.out.println("Reno a ajouté la Micra.");
    } else {
        System.out.println("Échec de l'ajout de la Micra à Reno.");
    }

    // Affichage des informations de Bob
    System.out.println("\nLes voitures de Bob :");
    for (int i = 0; i < bob.nbVoitures; i++) {
        System.out.println("Voiture " + (i + 1) + ": " + bob.liste_voitures[i]);
    }

    // Affichage des informations de Reno
    System.out.println("\nLes voitures de Reno :");
    for (int i = 0; i < reno.nbVoitures; i++) {
        System.out.println("Voiture " + (i + 1) + ": " + reno.liste_voitures[i]);
    }
}

} 

