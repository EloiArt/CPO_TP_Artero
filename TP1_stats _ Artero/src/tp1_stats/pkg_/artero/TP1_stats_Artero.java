/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats.pkg_.artero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eloi
 */
public class TP1_stats_Artero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Étape 1: Créer un tableau de 6 entiers initialisé à 0
        int[] tab = new int[6]; // All cells initialized to 0

        // Étape 2: Demander à l'utilisateur de saisir un nombre entier m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre de lancers de dés : ");
        int m = scanner.nextInt();

        // Étape 3: Faire une boucle de m itérations et incrémenter les résultats
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int resultat = random.nextInt(6); // Génère un nombre aléatoire entre 0 et 5
            tab[resultat]++; // Incrémente la cellule correspondant à la face du dé
        }

        // Étape 4: Afficher le tableau des résultats
        System.out.println("Résultats des lancers de dés :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + tab[i]);
        }

        // Étape 5: Afficher les résultats en pourcentage
        System.out.println("\nRésultats des lancers de dés en pourcentage :");
        for (int i = 0; i < tab.length; i++) {
            double pourcentage = (double) tab[i] / m * 100;
            System.out.printf("Face %d: %.2f%%\n", i + 1, pourcentage);
        }

        scanner.close();
    }
}

    
    
    

