package exercicios;

public class exc60 {
   public static void main(String[] args) {
       int a = 0, b = 1; int contador = 0;
       System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");
       do { System.out.print(a + " ");
           int proximo = a + b; a = b; b = proximo;
           contador++;
       } while (contador < 20); } }

