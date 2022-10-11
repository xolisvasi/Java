// 5 exercício: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int product = sc.nextInt();
        double result;
        if (code == 1) {
            result = product * 4.0;
        }  
        else if (code == 2) {
             result = product * 4.50;
        } 
        else if (code == 3) {
             result = product * 5.0;
        } 
        else if (code == 4) {
                result = product * 2.0;
        }
        else {
                 result = product * 4.0;
        }
        System.out.printf("resulted in: $ %.2f\n", result);

        sc.close();
    }
}