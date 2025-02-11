package work;

@FunctionalInterface
interface CompareNumbers {
    boolean isGreater(int a, int b);
}

@FunctionalInterface
interface Increment {
    int incrementByOne(int num);
}

@FunctionalInterface
interface Concatenate {
    String concat(String str1, String str2);
}

@FunctionalInterface
interface ToUpperCase {
    String convert(String str);
}


public class Ques1 {
    public static void main(String[] args) {
        // Compare two Numbers
        CompareNumbers compare = (a, b) -> a > b;
        System.out.println(compare.isGreater(10, 5));

        // Increment Number By One
        Increment increment = a -> a+ 1;
        System.out.println(increment.incrementByOne(7));

        // Concatenate two strings
        Concatenate concatenate = (str1, str2) -> str1 + str2;
        System.out.println(concatenate.concat("Hello, ", "Simran!"));

        // Lambda for converting a string to uppercase
        ToUpperCase toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.convert("Annie"));
    }

}
