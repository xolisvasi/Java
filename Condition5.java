// Exercício 6

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Locale;
import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double code = sc.nextDouble();

        if ( code < 0.0 || code > 100.0) { 
            System.out.println("out of range.");
        }
        else if  (code <= 25.0 ) {
                 System.out.println(" interval [0,25]");
         }
        else if  (code <= 50.0 ) {
                    System.out.println(" interval [25,50]");
         }
        else if  (code <= 75.0 ) {
                System.out.println(" interval [50,75]");  
        } 
        else
            System.out.println(" interval [75,100]"); 
            sc.close(); 
    }
    
}
