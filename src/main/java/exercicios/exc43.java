package exercicios;
import java.util.Scanner;
public class exc43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int a = 0, b = 1;
        int fibonacci = 0;
        System.out.println("Sequência de Fibonacci até " + numero + ":");
        while (fibonacci <= numero) { System.out.print(fibonacci + " ");
            a = b; b = fibonacci; fibonacci = a + b;
        }
}
}
