import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Exercício 02
        * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        */

        Scanner sc = new Scanner(System.in);
        int evenOrOdd;

        System.out.println("Digite um número: ");
        evenOrOdd = sc.nextInt();

        if (evenOrOdd % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        sc.close();
    }
}