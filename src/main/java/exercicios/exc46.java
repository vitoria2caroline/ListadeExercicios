package exercicios;
import java.util.Scanner;
public class exc46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int soma = 0; int i = 2;
        while (i <= numero) { soma += i; i += 2; }
        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);
}}
