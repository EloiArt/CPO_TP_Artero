/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres.pkg_.artero;

/**
 *
 * @author eloi
 */
public class TP2_Bieres_Artero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.decapsuler();
       BouteilleBiere Biere = new BouteilleBiere("Leffe",
6.6 ,"Abbaye de Leffe") ;
        Biere.lireEtiquette();
        Biere.decapsuler();
        BouteilleBiere laBiere = new BouteilleBiere("8.6",
83.2 ,"Maison de la bibine") ;
        laBiere.lireEtiquette();
        laBiere.decapsuler();
        BouteilleBiere maBiere = new BouteilleBiere("Bud",
7.8 ,"La Binouzerie") ;
        maBiere.lireEtiquette();
        maBiere.decapsuler();
        
        
        
    }
    
}
