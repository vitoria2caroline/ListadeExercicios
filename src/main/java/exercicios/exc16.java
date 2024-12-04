package exercicios;
import java.util.Scanner;
/*16) Faça um programa que verifique se um número é positivo, negativo ou zero.*/
public class exc16 {
       public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite um número inteiro: ");
       int numero = entrada.nextInt();
       if (numero > 0) { System.out.println("O número " + numero + " é positivo.");
       } else if (numero < 0) { System.out.println("O número " + numero + " é negativo.");
       } else { System.out.println("O número " + numero + " é zero.");
       }
   }
   }



