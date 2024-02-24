class Calculator {
    private int add(int a, int b) {
        return a + b;
    }

    public int addNumbers(int num1, int num2) {
        return add(num1, num2);
    }
    
    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }
}

public class calc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.addNumbers(5, 3);
        int difference = calc.subtractNumbers(10, 7);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
