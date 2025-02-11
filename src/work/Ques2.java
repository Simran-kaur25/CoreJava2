package work;

@FunctionalInterface
interface ArithmeticOperation {
    int operate(int a, int b);
}

public class Ques2 {

    // Instance methods for addition and subtraction
    public int add(int a, int b) {
        return a + b;
    }

    // Instance methods for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Static method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Ques2 obj = new Ques2();


        ArithmeticOperation addition = obj::add;
        System.out.println("Addition: " + addition.operate(5, 3));


        ArithmeticOperation subtraction = obj::subtract;
        System.out.println("Subtraction: " + subtraction.operate(10, 4));


        ArithmeticOperation multiplication = Ques2::multiply;
        System.out.println("Multiplication: " + multiplication.operate(6, 2));
    }
}
