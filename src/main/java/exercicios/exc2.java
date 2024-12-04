package exercicios;
import java.util.Scanner;
/* 2) Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro. */
public class exc2 { public static void main(String[] args) {
    float raio;
    double pi = 3.14;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o valor do raio:");
    raio = entrada.nextInt();
    double area = pi * (raio * raio);
    double perimetro = 2 * pi * raio;
    System.out.println("O perímetro do círculo é: " + perimetro + "cm");
    System.out.println("A área do círculo é: " + area + "cm²");
}
}

