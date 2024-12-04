package exercicios;
import java.util.Scanner;
public class exc90 { public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    boolean temZero = false;
    for (int i = 0; i < 5; i++)
    { System.out.print("Digite o " + (i + 1) + "º número: ");
        if (entrada.nextInt() == 0) { temZero = true; }
    } if (temZero)
    { System.out.println("Existe pelo menos um número igual a zero.");
    } else { System.out.println("Nenhum dos números digitados é igual a zero.");
    } entrada.close(); }
}

