package exercicios;
import java.util.Scanner;
public class exc22 {
    /*22) Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus. Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.*/
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Digite o salário do funcionário: ");
      double salario = entrada.nextDouble();
      double bonus; if (salario > 2000) {
          bonus = salario * 0.10;
      }else { bonus = salario * 0.05;
          System.out.println("O valor do bônus é: R$ " + bonus);
      }
  }
}
