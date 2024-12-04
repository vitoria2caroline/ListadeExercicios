package exercicios;
import java.util.Scanner;
public class exc7 {
   /* 7) Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.*/
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o salário base do funcionário: ");
    float salarioBase = entrada.nextFloat();
    double comissao = salarioBase * 0.05;
    double salarioLiquido = salarioBase + comissao;
    System.out.println("O salário líquido é: R$ " + salarioLiquido); } }

