package exercicios;
import java.util.Scanner;
public class exc81 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt(); }
         System.out.println("Números na ordem inversa:");
        for (int i = 4; i >= 0; i--)
        { System.out.println(numeros[i]); }
        entrada.close();
    }
}

