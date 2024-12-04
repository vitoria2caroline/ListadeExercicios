package exercicios;
import java.util.Scanner;
public class exc88 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int somaPares = 0, somaImpares = 0; int contPares = 0, contImpares = 0;
       for (int i = 0; i < 5; i++)
       { System.out.print("Digite o " + (i + 1) + "º número: ");
           int numero = entrada.nextInt();
        if (numero % 2 == 0)
        { somaPares += numero; contPares++;
        } else { somaImpares += numero; contImpares++; } }
       double mediaPares = (contPares > 0) ?
               (double) somaPares / contPares : 0;
       double mediaImpares = (contImpares > 0) ?
               (double) somaImpares / contImpares : 0;
       System.out.println("Média dos valores pares: " + mediaPares);
       System.out.println("Média dos valores ímpares: " + mediaImpares);
       entrada.close();
   }
}


