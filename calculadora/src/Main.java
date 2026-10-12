import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First value: ");
        double firstValue = sc.nextDouble();

        System.out.print("Operador value: ");
        char operator = sc.next().charAt(0);

        boolean isWrongOperator = operator != '+'
                || operator != '-'
                || operator != '*'
                || operator != '/';

        if (isWrongOperator) {
            System.out.println("Wrong operator! Please introduce a new operator");
            return;
        }

        System.out.print("Second value: ");
        double secondValue = sc.nextDouble();

        double result = 0;

        switch (operator) {
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