package exercicios;
import java.util.Scanner;
public class exc42 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero <= 1) {
                System.out.println(numero + " não é um número primo.");
                return;
            }

            boolean ehPrimo = true;
            int i = 2;

            while (i <= numero / 2) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
                i++;
            }

            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }