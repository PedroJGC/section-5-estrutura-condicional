import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Exercício 04
         * Leia a hora inicial e a hora final de um jogo.
         * A seguir calcule a duração do jogo, sabendo que o mesmo pode
         * começar em um dia e terminar em outro, tendo uma
         * duração mínima de 1 hora e máxima de 24 horas.
         * */

        Scanner sc = new Scanner(System.in);

        int startTime, endTime, totalTime;

        System.out.println("Digite a hora inicial do jogo: ");
        startTime = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        endTime = sc.nextInt();

        if (endTime < startTime) {
            totalTime = (24 - startTime) + endTime;
        } else if (endTime > startTime) {
            totalTime = endTime - startTime;
        } else {
            totalTime = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", totalTime);

        sc.close();
    }
}