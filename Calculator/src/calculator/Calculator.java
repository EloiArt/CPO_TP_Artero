/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * TP0 Partie 3
 * @author eloi
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo");
        int operateur;
        Scanner op;
op = new Scanner(System.in);  
operateur = op.nextInt();
if (operateur>5){
    System.out.println("Veuillez choisir une valeur valide"); 
    System.exit(0);
}
System.out.println("Entrez une première valeur");
int operande1;
        Scanner ope;
ope = new Scanner(System.in);  
operande1 = ope.nextInt();
System.out.println("Entrez une seconde valeur");
int operande2;
Scanner oper;
oper = new Scanner(System.in);  
operande2 = oper.nextInt();
double result;
result=0;
if (operateur==1){
    result=operande1 + operande2;
}
else if(operateur==2){
    result=operande1-operande2;
}
else if (operateur==3){
    result=operande1*operande2;
}
else if (operateur==4){
    result=operande1/operande2;
}
else if (operateur==5){
    result=operande1%operande2;
}
System.out.println("Voici le résultat: " + result);
    }
    
}
