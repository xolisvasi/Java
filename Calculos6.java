// Exercícios Estrutura Sequencial


import java.util.Scanner;

public class Calculos6 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double x, s1, s2, s3;
    System.out.println("Insira o número 1:");
    s1 = sc.nextDouble();
    System.out.println("Insira o número 2:");
    s2 = sc.nextDouble();
    System.out.println("Insira o número 3:");
    s3 = sc.nextDouble();
    x = (s1 * s3 / 2);
    System.out.printf("Triângulo: %.3f \n", +x);
    x = (s3 * s3 * 3.14159);
    System.out.printf("Círculo: %.3f\n", +x);
    x = (s1 + s2) * s3 / 2;
    System.out.printf("Trapézio: %.3f\n", +x);
    x = (s2 * s2);
    System.out.printf("Quadrado: %.3f\n", +x);
    x = s1 * s2;
    System.out.printf("Retângulo: %.3f\n", +x);
    sc.close();
  }
}