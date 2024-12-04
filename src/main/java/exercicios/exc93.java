package exercicios;
import java.util.Scanner;
public class exc93 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int contIntervalo = 0;
       for (int i = 0; i < 10; i++)
       { System.out.print("Digite o " + (i + 1) + "º número: ");
           int numero = entrada.nextInt();
           if (numero >= 10 && numero <= 50)
           { contIntervalo++; } }
       System.out.println("Quantidade de números no intervalo de 10 a 50: " + contIntervalo);
       entrada.close();
   }
}
