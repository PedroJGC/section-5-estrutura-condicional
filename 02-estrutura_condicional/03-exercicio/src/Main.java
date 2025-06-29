import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 03
         * Leia 2 valores inteiros (A e B). Após, o programa
         * deve mostrar uma mensagem "São Múltiplos" ou "Não são
         * Múltiplos", indicando se os valores lidos são múltiplos entre si.
         * Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
         * */

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite um valor para A: ");
        a = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        b = sc.nextInt();

        if (a % b == 0) {
            System.out.println("São múltiplos");
        } else if (b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}