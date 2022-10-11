
// Exercícios Estrutura Sequencial
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
import java.util.Scanner;

public class Calculos5 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int p1, p2, c1, c2;
    double x, v1, v2;
    System.out.println("Insira o código da peça:");
    c1 = sc.nextInt();
    System.out.println("Insira o números de peças:");
    p1 = sc.nextInt();
    System.out.println("Insira o valor a pagar:");
    v1 = sc.nextDouble();
    System.out.println("O número do código da peça 1 é: " + c1);
    System.out.println("O número da peça 1 é: " + p1);
    System.out.println("Insira o código da peça 2:");
    c2 = sc.nextInt();
    System.out.println("Insira o números de peças 2:");
    p2 = sc.nextInt();
    System.out.println("Insira o valor a pagar:");
    v2 = sc.nextDouble();
    x = (p1 * v1 + p2 * v2);
    System.out.println("O número do código da peça 2 é: " + c2);
    System.out.println("O número da peça 2 é: " + p2);
    System.out.printf("O valor a pagar é: R$%.2f\n", +x);
    sc.close();
  }
}