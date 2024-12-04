package exercicios;
import java.util.Scanner;
public class exc31 {
    /* 31) Faça um programa que leia o valor do salário-mínimo e o salário de um funcionário, e exiba quantos salários-mínimos ele recebe. */
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite o valor do salário-mínimo: ");
       double salarioMinimo = entrada.nextDouble();
       System.out.print("Digite o salário do funcionário: ");
       double salarioFuncionario = entrada.nextDouble();
       double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
       System.out.printf("O funcionário recebe %.2f salários-mínimos.\n", quantidadeSalariosMinimos);
   }
}
