//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double price = 34.5;
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;

        System.out.println(discount);
    }
}