import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First value: ");
        double firstValue = sc.nextDouble();

        System.out.print("Operador value: ");
        String operador = sc.next();

        System.out.print("Second value: ");
        double secondValue = sc.nextDouble();

        double result = 0;

        switch (operador.charAt(0)) {
            case '+' -> result = firstValue + secondValue;
            case '-' -> result = firstValue - secondValue;
            case '*' -> result = firstValue * secondValue;
            case '/' -> result = firstValue / secondValue;
            default -> System.out.println("No operation found!");
        }

        System.out.println("Resultado: " + result);

        sc.close();
    }
}