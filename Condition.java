// Exercício 1
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 0) {
                System.out.println("Número negativo");
        }
         else {
                System.out.println("Número positivo");
        }
        sc.close();
    }
}