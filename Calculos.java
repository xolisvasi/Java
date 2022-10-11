
// Exercícios Estrutura Sequencial
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos.
import java.util.Scanner;

public class Calculos {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int x, s1, s2;
    System.out.println("Insira um número:");
    s1 = sc.nextInt();
    System.out.println("Insira um número:");
    s2 = sc.nextInt();
    x = s1 + s2;
    System.out.println("DADOS DIGITADOS:");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println("a soma resultou em: " + x);
    sc.close();
  }

  // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
  // calcule e mostre a diferença do produto
  // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
}
