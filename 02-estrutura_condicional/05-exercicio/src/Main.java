import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Exercício 05
        * Com base na tabela abaixo, escreva um programa que
        * leia o código de um item e a quantidade deste item.
        * A seguir, calcule e mostre o valor da conta a pagar.
        * */

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int quantity = sc.nextInt();
        double total = 0;

        if (code >= 1 && code <= 5) {
            if (code == 1) {
                total = quantity * 4;
            } else if (code == 2) {
                total = quantity * 4.5;
            } else if (code == 3) {
                total = quantity * 5;
            } else if (code == 4) {
                total = quantity * 2;
            } else {
                total = quantity * 1.5;
            }
        } else {
            System.out.println("Escolha um produto existente no cardápio!");
        }

        Locale.setDefault(Locale.US);
        System.out.printf("Total: R$ %.2f", total);

        sc.close();
    }
}