package exercicios;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class exc92 {
 public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     Integer[] numeros = new Integer[5];
    for (int i = 0; i < 5; i++)
    { System.out.print("Digite o " + (i + 1) + "º número: ");
        numeros[i] = entrada.nextInt();
    } Arrays.sort(numeros, Collections.reverseOrder());
    System.out.println("Números em ordem decrescente:");
    for (int numero : numeros) { System.out.println(numero);
    } entrada.close();
 } }

