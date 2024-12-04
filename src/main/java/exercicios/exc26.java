package exercicios;
import java.util.Scanner;
public class exc26 {
    /*26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] codigos = {1, 2, 3, 4, 5};
        double[] precos = {10.0, 20.0, 30.0, 40.0, 50.0};
        System.out.print("Digite o código do produto: ");
        int codigo = entrada.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();
        double precoProduto = 0;
        boolean produtoEncontrado = false;
        for (int i = 0; i < codigos.length; i++)
        { if (codigos[i] == codigo)
        { precoProduto = precos[i];
            produtoEncontrado = true; break; } }
        if (produtoEncontrado) { double valorTotal = precoProduto * quantidade;
            System.out.println("Valor total a ser pago: R$ " + valorTotal);
        } else { System.out.println("Código do produto inválido."); } } }

