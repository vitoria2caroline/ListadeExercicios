package exercicios;
import java.util.Scanner;
/*5) Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.
 */
public class exc5 {  public static void main(String[] args) {
    { Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();
        double total = preco * quantidade;
        if (quantidade > 10) { double desconto = total * 0.10;
            System.out.println("O valor total a ser pago é: R$ " + total);
        }
    }
}
}

