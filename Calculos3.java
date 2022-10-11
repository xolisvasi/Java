// Exercícios Estrutura Sequencial
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

import java.util.Scanner;

public class Calculos3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x, s1, s2, s3, s4;
        System.out.println("Insira o primeiro número:");
        s1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        s2 = sc.nextInt();
        System.out.println("Insira o terceiro número:");
        s3 = sc.nextInt();
        System.out.println("Insira o quarto número:");
        s4 = sc.nextInt();
        x = s1 * s2 - s3 * s4;
        System.out.println("a soma resultou em: " + x);
        sc.close();
    
    }
}
