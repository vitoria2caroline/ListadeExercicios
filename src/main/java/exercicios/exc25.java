package exercicios;
import java.util.Scanner;
public class exc25 {
    /*25) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação. Se o número de faltas for maior que 15, ele é reprovado por falta.*/
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Digite o número de faltas do aluno: ");
      int faltas = entrada.nextInt();
     if (faltas > 15) { System.out.println("Aluno reprovado por falta.");
     } else { System.out.println("Aluno aprovado.");
     }
  }
}
