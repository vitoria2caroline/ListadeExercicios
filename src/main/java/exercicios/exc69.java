package exercicios;
import java.util.Scanner;
public class exc69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0; for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
        } double media = (double) soma / 5;
        System.out.println("A média aritmética dos valores lidos é: " + media);
        scanner.close(); } }
