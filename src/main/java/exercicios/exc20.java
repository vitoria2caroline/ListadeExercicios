package exercicios;
import java.util.Scanner;

        /*20) Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.*/
       public class exc20 {
               public static void main(String[] args) {
                       Scanner entrada = new Scanner(System.in);
                       System.out.print("Digite um número inteiro: ");
                       int numero = entrada.nextInt();
                       if (numero % 2 == 0) { System.out.println("O número " + numero + " é par.");
                       } else { System.out.println("O número " + numero + " é ímpar.");
                       }
               }
       }