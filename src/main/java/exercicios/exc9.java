package exercicios;
import java.util.Scanner;
public class exc9 {
     /* 9) Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal, e calcule o montante após 12 meses. */

         public static void main(String[] args) {
             Scanner entrada = new Scanner(System.in);
             System.out.print("Digite o valor do depósito mensal: ");
             double depositoMensal = entrada.nextDouble();
             System.out.print("Digite a taxa de juros mensal (em %): ");
             double taxaJurosMensal = entrada.nextDouble() / 100;
             double montante = 0.0;
             for (int i = 0; i < 12; i++) {
                 montante = (montante + depositoMensal) * (1 + taxaJurosMensal);
                 System.out.println("O montante acumulado após 12 meses é: R$ " + montante); }
         }}