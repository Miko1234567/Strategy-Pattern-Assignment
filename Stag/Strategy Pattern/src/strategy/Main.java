package strategy;

public class Main {
    public static void main(String[] args) {
        CalculatorContext calculator = new CalculatorContext(new AddStrategy());
        System.out.println("10 + 5 = " + calculator.executeOperation(10, 5));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("10 * 5 = " + calculator.executeOperation(10, 5));

        calculator.setStrategy(new PowerStrategy());
        System.out.println("2 ^ 3 = " + calculator.executeOperation(2, 3));
    }
}