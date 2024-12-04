package exercicios;
import java.util.Scanner;
public class exc32 {

    /* 32) Escreva um programa que leia a nota de um aluno em uma prova e exiba a sua conceituação conforme a tabela de notas. */
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.print("Digite a nota do aluno: ");
         double nota = entrada.nextDouble();
         String conceito; if (nota >= 9) { conceito = "A";
         } else if (nota >= 7 && nota < 9)
         { conceito = "B";
         } else if (nota >= 5 && nota < 7)
         { conceito = "C";
         } else { conceito = "D";
         } System.out.println("O conceito da nota é: " + conceito); } }
