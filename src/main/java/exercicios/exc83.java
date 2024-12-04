package exercicios;
import java.util.Scanner;
public class exc83 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[7];
        int soma = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
            soma += numeros[i];
             }
        double media = (double) soma / numeros.length;
        System.out.println("A média aritmética dos valores lidos é: " + media);
        entrada.close();
    }
}

