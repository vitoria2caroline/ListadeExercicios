package exercicios;
import java.util.Scanner;
public class exc15 {
    /* 15) Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%. */
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();
        double aumento = salario * 0.15; double novoSalario = salario + aumento;
        System.out.println("O novo salário com aumento de 15% é: R$ " + novoSalario);
    }
    }