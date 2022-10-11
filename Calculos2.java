
// Exercícios Estrutura Sequencial
// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
// valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159
import java.util.Scanner;

public class Calculos2 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double r;
    double y, pi, raio;
    raio = 2.0;
    System.out.println("Insira um número:");
    r = sc.nextDouble();
    y = Math.pow(r, raio);
    pi = 3.14159 * y;
    System.out.printf("a soma resultou em: " + pi);
    sc.close();
  }
}