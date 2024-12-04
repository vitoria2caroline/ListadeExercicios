package exercicios;
import java.util.Scanner;
public class exc89 {
    public static void main(String[] args) {
        int positivos = 0, negativos = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");}
        int numero = entrada.nextInt();
        if (numero > 0) { positivos++;
        } else if (numero < 0) { negativos++;
        }
        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
    }


}
