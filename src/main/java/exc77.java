import java.util.Scanner;
public class exc77 {
 public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     System.out.print("Digite um número inteiro: ");
     int numero = entrada.nextInt();
     String numeroStr = String.valueOf(numero);
     System.out.println("Dígitos do número:");
     for (int i = 0; i < numeroStr.length(); i++) {
         System.out.println(numeroStr.charAt(i));
     } entrada.close();
 }
}

