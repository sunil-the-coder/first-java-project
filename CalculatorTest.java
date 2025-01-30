class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }
}

public class CalculatorTest
{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result:"+ calc.add(10, 20));

        System.out.println("Result:"+ calc.substract(10, 20));
    }
}