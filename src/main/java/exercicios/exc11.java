package exercicios;
import java.util.Scanner;
public class exc11 {
    /* 11) Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário. */
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
           System.out.print("Digite o primeiro número: ");
           double num1 = entrada.nextDouble();
           System.out.print("Digite o segundo número: ");
           double num2 = entrada.nextDouble();
           System.out.print("Digite o terceiro número: ");
           double num3 = entrada.nextDouble();
           double media = (num1 + num2 + num3) / 3;
           System.out.println("A média aritmética é: " + media); } }
