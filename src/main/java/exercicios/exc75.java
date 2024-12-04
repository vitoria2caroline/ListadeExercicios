package exercicios;

public class exc75 {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b; a = b; b = proximo;
        }
    }
}

