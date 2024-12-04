package exercicios;
import java.util.Scanner;
/*1) Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.*/
public class exc1 { public static void main(String[] args) {
    Scanner nota = new Scanner(System.in);
    System.out.print("Entre com a primeira nota: ");
    int n1 = nota.nextInt();
    System.out.print("Entre com a segunda nota: ");
    int n2 = nota.nextInt();
    int soma = n1 + n2;
    int subtração = n1- n2;
    int multiplicação = n1 * n2;
    int divisão = n1/n2;
    System.out.println("A soma das duas notas é: " + soma);
    System.out.println("A subritação dos números é: " + subtração);
    System.out.println("A multiplicação dos números é: " + multiplicação);
    System.out.println("A divisão dos números é: " + divisão);
} }
