interface MathOperation {
    int operate(int a, int b);
}


public class Main {
    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        System.out.println("Addition: " + operate(10, 5, addition));
        System.out.println("Subtraction: " + operate(10, 5, subtraction));
        System.out.println("Multiplication: " + operate(10, 5, multiplication));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    
}
