package exercicios;
import java.util.Scanner;
  /* 19) Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado ou reprovado. A média para aprovação é 7. */
  public class exc19 {
      public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          System.out.print("Digite a primeira nota: ");
          double nota1 = entrada.nextDouble();
          System.out.print("Digite a segunda nota: ");
          double nota2 = entrada.nextDouble();
          System.out.print("Digite a terceira nota: ");
          double nota3 = entrada.nextDouble();
          double media = (nota1 + nota2 + nota3) / 3;
          if (media >= 7) { System.out.println("Aluno aprovado com média: " + media);
          } else { System.out.println("Aluno reprovado com média: " + media);
          }
      }
  }

