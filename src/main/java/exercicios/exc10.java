package exercicios;
import java.util.Scanner;
public class exc10 {
    /* 10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor. */
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
