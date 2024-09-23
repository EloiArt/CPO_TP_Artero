/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_artero;

import java.util.Scanner;

/**
 *
 * @author eloi
 */
public class TP1_manipNombresInt_Artero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int ope1;
       int ope2;
       System.out.println("Veuillez choisir deux entiers"); 
        Scanner sc;
sc = new Scanner(System.in);  
ope1 = sc.nextInt();
ope2 = sc.nextInt();
int add;
add=ope1+ope2;
int sous;
sous=ope1-ope2;
int mult;
mult=ope1*ope2;
int div;
div=ope1/ope2;
double reste;
reste= div -ope1%ope2;
System.out.println("L'addition: " + add + "\nLa soustraction: " + sous + "\nLa multiplication: " + mult +"\nQuotient entier: "+ div 
+ "\n Reste: " +reste); 
    
}
}