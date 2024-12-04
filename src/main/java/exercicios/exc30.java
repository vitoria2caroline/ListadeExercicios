package exercicios;
import java.util.Scanner;
public class exc30 {
    /* 30) Crie um programa que leia o número de maçãs compradas e exiba o valor total a ser pago. O preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12 e R$ 0,40 cada se a quantidade for igual ou maior que 12. */
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.print("Digite o número de maçãs compradas: ");
         int quantidade = entrada.nextInt();
         double precoPorMaca;
         if (quantidade < 12)
         {precoPorMaca = 0.50;
         } else { precoPorMaca = 0.40; }
        double valorTotal = quantidade * precoPorMaca;
        System.out.printf("O valor total a ser pago é: R$ %.2f\n", valorTotal);
     }
}
