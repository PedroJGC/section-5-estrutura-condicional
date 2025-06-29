import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Exercício 01
        * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        */
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite um número inteiro positivo ou negativo: ");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}