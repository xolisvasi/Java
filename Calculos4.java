
// Exercícios Estrutura Sequencial
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais.
import java.util.Scanner;

public class Calculos4 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int s1;
    double x, s2, s3;
    System.out.println("Insira o seu número:");
    s1 = sc.nextInt();
    System.out.println("Insira seu número de horas trabalhadas:");
    s2 = sc.nextDouble();
    System.out.println("Insira o valor que recebe por hora:");
    s3 = sc.nextDouble();
    x = (s2 * s3);
    System.out.println("O seu número é:" + s1);
    System.out.printf("Salário: R$" + x);
    sc.close();
  }
}