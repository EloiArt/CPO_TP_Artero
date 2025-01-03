/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author eloi
 */
public class Magicien extends Personnage {

    private boolean estConfirme;

    // Constructeur pour initialiser Magicien avec nom, niveau de vie et s'il est confirmé
    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
    }

    // Getter pour savoir si le magicien est confirmé
    public boolean isEstConfirme() {
        return estConfirme;
    }

    // Setter pour modifier le statut "confirmé"
    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    // Redéfinition de toString pour inclure le statut "confirmé"
    @Override
    public String toString() {
        return super.toString() + ", estConfirme=" + estConfirme + '}';
    }
}

