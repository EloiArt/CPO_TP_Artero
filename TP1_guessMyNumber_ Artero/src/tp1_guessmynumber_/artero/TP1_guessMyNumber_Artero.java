/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_.artero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eloi
 */
public class TP1_guessMyNumber_Artero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val;
        int dif;
        int i=1;
        System.out.println("Choisi 1, 2 ou 3");
         Scanner an;
an = new Scanner(System.in);  
dif = an.nextInt();
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
         if (dif==1){
       System.out.println("mode 1, indication plus claire et coups illimités");}
         if (dif==2){
       System.out.println("mode 2, nb de tentative limité a 10");}
         if (dif==3){
       System.out.println("mode 3");}
          System.out.println("Saisissez un nombre entre 0 et 100");
        Scanner sc;
sc = new Scanner(System.in);  
val = sc.nextInt();

while (n!=val){
    
    
    i = i +1 ; 
if (n<val){
    if (dif==1){if (val-n>20){System.out.println("Vraiment trop grand");}}
    System.out.println("Trop grand");
    sc = new Scanner(System.in);  
val = sc.nextInt();
}
    else if (n>val){if (dif==1){if (n-val>20){System.out.println("Vraiment trop petit");}}
    System.out.println("Trop petit");
    sc = new Scanner(System.in);  
val = sc.nextInt();
    }
else if (n==val){
System.out.println("Gagné !");
}
System.out.println(i+" Tentatives");
}
if (dif==2){
         
if (i>9){ 
    return;
}
    }
}
    }
    
