/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_artero;

/**
 *
 * @author eloi
 */
public class Arme {
 
     private String nom;
    private int Attaque;

    // Constructeur
    public Arme(String nom, int Attaque) {
        this.nom = nom;
        this.Attaque = Math.min(Attaque, 100);  // Limite le niveau d'attaque à 100
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getAttaque() {
        return this.Attaque;
    }

    // Méthode pour obtenir le nom (optionnelle, si besoin)
    public String getNom() {
        return this.nom;
    }
    
}

