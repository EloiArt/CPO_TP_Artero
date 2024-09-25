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
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println("Saisissez un nombre entre 0 et 100"); 
        Scanner sc;
sc = new Scanner(System.in);  
val = sc.nextInt();
System.out.println(n);
if (n<val){
    System.out.println("Trop grand");
}
    else if (n>val){
    System.out.println("Trop petit");
    }
else if (n==val){
System.out.println("Gagné !");
}
while (n==val){
}
}
    }
    
